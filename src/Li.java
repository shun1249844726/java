public class Li {
    public  void executeMessage(CallBack callBack,String question){
        System.out.println("小王问的问题："+ question);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("让我想想看,知道答案告诉你");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String result = "答案是2";
                callBack.solve(result);
            }
        }).start();

    }
}
