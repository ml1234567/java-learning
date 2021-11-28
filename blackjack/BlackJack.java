import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BlackJack {
    //新建三个动态数组来存储卡牌，电脑分到的卡牌，还有人分到的卡牌。
    private static ArrayList<Card> cards = new ArrayList<Card>();
    private static ArrayList<Card> cardsComputer = new ArrayList<Card>();
    private static ArrayList<Card> cardsPlayer = new ArrayList<Card>();

    //打印开头提示
    public static void main(String[] args){
        System.out.println("21点游戏");
        System.out.println("****************");
        System.out.println("A表示1点或11点,2-10表示2-10点,J、Q、K表示10点");
        reset();
        System.exit(0);
    }
    //初始化最开始的两张发牌。
    public static int sendCardInit(int id){
        int counter = 1;//记录牌数
        int point = 0;//记录点数
        if(id == 1){//发给玩家的牌
            point = sendCard(id,counter)+sendCard(id,counter+1);//两张牌的总点数，调用sendCard方法
            long countA = cardsPlayer.stream().filter(card -> "A".equals(card.getMask())).count();//看牌里面有没有A
            if (countA != 0) {
                int point1 = point + 10;
                System.out.println("玩家的总点数: "+point+"或者"+point1);
            }else {
                System.out.println("玩家的总点数: "+point);
            }
        }else{//发给电脑的牌
            int x = sendCard(id,counter);
            counter = counter +1;
            int y = sendCard(id,counter);
            point = x+y;
            System.out.println("电脑可能的点数: "+(point-x+1)+"~"+(point-x+11));
            //System.out.println(point);
        }
        return point;
    }

    //发牌
    public static int sendCard(int id,int counter){
        //printCards();
        int sum = 0;
        Card curr = cards.get(0);//获取第一张牌
        if(id == 0){//给电脑
            if(counter == 1){
                System.out.println("第"+counter+"张牌: *");//打印电脑的第一张牌，但不告知点数及花色
                sum = sum +curr.getValue();//这张牌的点数
                //System.out.println(sum);
                //System.out.println(curr.getIconMask()+curr.getMask());
            }else{
                sum = sum +curr.getValue();
                System.out.print("第"+counter+"张牌: ");//打印，但是告知花色及点数
                System.out.println(curr.getIconMask()+curr.getMask());
            }
            cardsComputer.add(cards.get(0));//发牌
        }else{//给玩家
            sum = sum +curr.getValue();
            System.out.print("第"+counter+"张牌: ");
            System.out.println(curr.getIconMask()+curr.getMask());
            cardsPlayer.add(cards.get(0));//发牌
        }
        cards.remove(0);//除去已抽到的牌
        return sum;
    }

    //加牌并且对A进行判断
    public static int extraCard(int id, int counter,int point){
        int sum = point;
        System.out.print("第"+(counter+2)+"张牌: ");
        System.out.println(cards.get(0).getIconMask()+cards.get(0).getMask());
        Card card = cards.get(0);
        sum = sum + card.getValue();
        if (card.getMask().equals("A") && sum + 10 <= 21){//如果A是11这时还没有超过21点那就当11处理
            sum += 10;
        }
        if(id == 0){
            cardsComputer.add(cards.get(0));//把cards里的第一张牌发给电脑或玩家
        }else{
            cardsPlayer.add(cards.get(0));
        }
        cards.remove(0);
        return sum;
    }
    //
    public static void printCards(){//打印牌
        for(int i=0; i<cards.size();i++){
            System.out.print(cards.get(i).getIconMask()+cards.get(i).getMask()+" ;");
        }
    }

    public static void init(){
        initMethod(1);
        initMethod(2);
        initMethod(3);
        initMethod(4);
    }
    //初始化扑克牌
    public static void initMethod(int icon){
        int index = 0;
        String iconMask= "";

        //初始化iconMask花色、字标
        if(icon == 1){
            index = 0;
            iconMask = "♥";
        }else if(icon == 2){
            index = 13;
            iconMask = "♦";
        }else if(icon == 3){
            index = 26;
            iconMask = "♠";
        }else if(icon == 4){
            index = 39;
            iconMask = "♣";
        }
        //创建扑克牌
        for(int i = index;i < index+13;i++){
            if(i == index+0){
                Card  c = new Card("A",i-index+1,icon,iconMask,true);
                cards.add(c);
            }else if(i >index && i <10+index){
                Card c =new Card(String.valueOf(i+1-index),i-index+1,icon,iconMask,true);
                cards.add(c);
            }else if(i >=10+index && i <13+index){
                if(i == 10+index){
                    Card c =new Card("J",10,icon,iconMask,true);
                    cards.add(c);
                }else if(i == 11+index){
                    Card c =new Card("Q",10,icon,iconMask,true);
                    cards.add(c);
                }else if(i == 12+index){
                    Card c =new Card("K",10,icon,iconMask,true);
                    cards.add(c);
                }
            }
        }
    }

    public static void printComputer(){
        System.out.println("电脑的牌: ");
        for(int j =0; j< cardsComputer.size();j++){
            System.out.print("第"+(j+1)+"张牌: ");
            System.out.println(cardsComputer.get(j).getIconMask()+cardsComputer.get(j).getMask());
        }
    }

    public static void printPlayer(){
        System.out.println("玩家的牌: ");
        for(int j =0; j< cardsPlayer.size();j++){
            System.out.print("第"+(j+1)+"张牌: ");
            System.out.println(cardsPlayer.get(j).getIconMask()+cardsPlayer.get(j).getMask());
        }
    }


    public static void reset(){
        init();//生成扑克牌
        //打乱牌
        Collections.shuffle(cards);
        System.out.println("电脑的牌: ");
        int computer = sendCardInit(0);//发牌给电脑
        System.out.println("----------------");
        System.out.println("玩家的牌: ");
        int player = sendCardInit(1);//发牌给玩家
        System.out.println("----------------");
        System.out.println("请输入指令:");
        System.out.println("输入S表示不加牌并开牌;输入H表示加牌;输入R表示重置;输入Q表示退出");

        Scanner s = new Scanner(System.in);
        while(true){
            String command = s.nextLine();
            if(command.equals("S")||command.equals("s")){//对指令进行判断
                if(player>21){
                    System.out.println("****************");
                    printComputer();

                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();

                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("真遗憾，您输了，电脑获胜！");
                }
                //判断电脑总点数有没有超过17，没超过就加牌。
                if(computer<17){
                    System.out.println("电脑加牌");
                    for(int j =0; j< cardsComputer.size();j++){
                        System.out.print("第"+(j+1)+"张牌: ");
                        System.out.println(cardsComputer.get(j).getIconMask()+cardsComputer.get(j).getMask());
                    }
                }
                int extraCounter = 0;
                while(computer<17){
                    computer = extraCard(0,extraCounter+1,computer);
                    extraCounter = extraCounter+1;
                }

                if(computer > 21){
                    System.out.println("****************");
                    printComputer();
                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();
                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("真厉害，您赢了，玩家获胜！");
                }else if(computer > player){
                    System.out.println("****************");
                    printComputer();
                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();
                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("真遗憾，您输了，电脑获胜！");
                }else if(computer < player){
                    System.out.println("****************");
                    printComputer();
                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();
                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("真厉害，您赢了，玩家获胜！");
                }else{
                    System.out.println("****************");
                    printComputer();
                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();
                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("平局，无人获胜！");
                }
            }else if(command.equals("H")||command.equals("h")){//对指令进行判断
                System.out.println("玩家加牌");
                for(int j =0; j< cardsPlayer.size();j++){
                    System.out.print("第"+(j+1)+"张牌: ");
                    System.out.println(cardsPlayer.get(j).getIconMask()+cardsPlayer.get(j).getMask());
                }
                player =extraCard(1,cardsPlayer.size()-2+1,player);
                System.out.println("玩家的总点数: "+player);
                if(player>21){
                    System.out.println("****************");
                    printComputer();
                    System.out.println("电脑的最终点数: " + computer);
                    System.out.println("----------------");
                    printPlayer();
                    System.out.println("玩家的最终点数: " + player);
                    System.out.println("真遗憾，您输了，电脑获胜！");
                }
            }else if(command.equals("R")||command.equals("r")){//对指令进行判断
                System.out.println("21点游戏");
                System.out.println("****************");
                System.out.println("A表示1点或11点,2-10表示2-10点,J、Q、K表示10点");
                cards.clear();//重新开始游戏
                cardsComputer.clear();
                cardsPlayer.clear();
                init();
                Collections.shuffle(cards);
                System.out.println("电脑的牌: ");
                computer = sendCardInit(0);//重新发牌
                System.out.println("----------------");
                System.out.println("玩家的牌: ");
                player = sendCardInit(1);
                System.out.println("----------------");
                print();
            }else if(command.equals("Q")||command.equals("q")){
                System.err.println("成功退出游戏");
                break;
            }else{
                System.err.println("无效输入！输入S表示不加牌并开牌;输入H表示加牌;输入R表示重置;输入Q表示退出");
            }
        }
        s.close();
    }

    public static void print(){
        System.out.println("请输入指令:");
        System.out.println("输入S表示不加牌并开牌;输入H表示加牌;输入R表示重置;输入Q表示退出");
    }
}
