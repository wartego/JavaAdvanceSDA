package DrugiTrener.Dzien4.FlatMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CarBrand vw = new CarBrand(
                "VW", List.of("Passat","Golf","Polo","Tiguan","Arteon"));

        CarBrand skoda = new CarBrand(
                "Skoda", List.of("Fabia", "Octavia", "Superb", "Kamiq", "Kodiak")
        );
        CarBrand toyota = new CarBrand(
                "Toyota", List.of("Yaris","Corolla", "C-HR","Rav4"));


        List<CarBrand> brands = List.of(vw,skoda,toyota);
        Stream<CarBrand>  carBrandStream = brands.stream();
        Stream<String> brandNamesStream = carBrandStream.map(carBrand -> carBrand.getName());
   //     List<String> brandNames = brandNamesStream.collect(Collectors.toList());

        System.out.println("Map function");
        List<List<String>> list = brands.stream().map(carBrand -> carBrand.getModel()).collect(Collectors.toList());
        System.out.println(list);


        //flatmap
        System.out.println("Flatmap function");
        List<String> models = brands.stream().flatMap(brand -> brand.getModel().stream()).collect(Collectors.toList());
        System.out.println(models);

    }
}
