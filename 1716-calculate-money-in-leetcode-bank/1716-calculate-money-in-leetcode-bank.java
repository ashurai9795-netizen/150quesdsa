class Solution {
    public int totalMoney(int n) {
        int paisa=1;
        int puraPaisa=0;
        for(int i=1;i<=n;i++){
          puraPaisa+=paisa;
          paisa++;
           if(i%7==0) paisa=i/7+1;
        }
        return puraPaisa;
    }
}