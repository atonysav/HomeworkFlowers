public class FlowerStore {

    private int pocket;

    public int getPocket() {
        return pocket;
    }

    public void setPocket(int pocket) {
        this.pocket = pocket;
    }

    public Flowers[] sell(int roses, int tulips, int chamomiles){
        Flowers[] flowers = new Flowers[roses+tulips+chamomiles];
        for(int i=0; i<roses; i++){
            flowers[i]=new FlowersRoses();
            pocket += new FlowersRoses().getPrice();
        }
        for(int i=roses; i<roses+tulips; i++){
            flowers[i]= new FlowersTulips();
            pocket += new FlowersTulips().getPrice();
        }
        for(int i=roses+tulips; i<roses+tulips+chamomiles; i++){
            flowers[i]=new FlowersChamomiles();
            pocket += new FlowersChamomiles().getPrice();
        }
        return flowers;
    }

    public Flowers[] sellSequence(int roses, int tulips, int chamomiles){
        int allFlowersCount = roses+tulips+chamomiles;
        Flowers[] flowers = new Flowers[allFlowersCount];

        for(int i =0; i<allFlowersCount; i++){
            if(roses>=tulips && roses>=chamomiles){
                flowers[allFlowersCount-(i+1)]=new FlowersRoses();
                roses--;
                pocket += new FlowersRoses().getPrice();
            }
            else if(tulips>=roses && tulips>=chamomiles){
                flowers[allFlowersCount-(i+1)]=new FlowersTulips();
                tulips--;
                pocket += new FlowersTulips().getPrice();
            }
            else {
                flowers[allFlowersCount-(i+1)] = new FlowersChamomiles();
                chamomiles--;
                pocket += new FlowersChamomiles().getPrice();
            }
        }
        return flowers;

    }
}
