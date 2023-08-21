package structural.adapter.thirdpartyfilter;

import structural.adapter.Image;

public class Caramel {
    public void init() {
        //This method has to be called before render method. Let's say it is the requirement set
        //to use this filter from third party
    }

    public void render(Image image) {
        System.out.println("Applying Caramel Filter");
    }
}
