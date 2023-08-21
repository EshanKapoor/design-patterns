package structural.adapter;

import structural.adapter.thirdpartyfilter.Caramel;

public class Main {
    public static void main(String[] args) {
        Image image = new Image();
        ImageView imageView = new ImageView(image);
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
