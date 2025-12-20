package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(outsourcedPartRepository.count() == 0) {
            OutsourcedPart battery = new OutsourcedPart();
            battery.setName("battery");
            battery.setInv(20);
            battery.setPrice(95.00);
            battery.setId(1);
            battery.setMinInv(2);
            battery.setMaxInv(30);
            outsourcedPartRepository.save(battery);

            OutsourcedPart tires = new OutsourcedPart();
            tires.setName("tires");
            tires.setInv(40);
            tires.setPrice(105.00);
            tires.setId(2);
            tires.setMinInv(2);
            tires.setMaxInv(50);
            outsourcedPartRepository.save(tires);

            OutsourcedPart sparkPlugs = new OutsourcedPart();
            sparkPlugs.setName("spark plugs");
            sparkPlugs.setInv(80);
            sparkPlugs.setPrice(20.00);
            sparkPlugs.setId(3);
            sparkPlugs.setMinInv(3);
            sparkPlugs.setMaxInv(100);
            outsourcedPartRepository.save(sparkPlugs);

            OutsourcedPart oilFilters = new OutsourcedPart();
            oilFilters.setName("oil filters");
            oilFilters.setInv(60);
            oilFilters.setPrice(30.00);
            oilFilters.setId(4);
            oilFilters.setMinInv(2);
            oilFilters.setMaxInv(70);
            outsourcedPartRepository.save(oilFilters);

            OutsourcedPart lights = new OutsourcedPart();
            lights.setName("lights");
            lights.setInv(90);
            lights.setPrice(80.00);
            lights.setId(5);
            lights.setMinInv(2);
            lights.setMaxInv(100);
            outsourcedPartRepository.save(lights);

            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Battery")) thePart = part;
                if (part.getName().equals("tires")) thePart = part;
                if (part.getName().equals("spark plugs")) thePart = part;
                if (part.getName().equals("oil filters")) thePart = part;
                if (part.getName().equals("lights")) thePart = part;
            }


            System.out.println(thePart.getCompanyName());

            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

        }

        if(productRepository.count() == 0) {
            Product bmw = new Product("BMW", 91000.0, 15);
            Product honda = new Product("Honda", 65000.0, 25);
            Product kia = new Product("Kia", 45000.0, 22);
            Product chevrolet = new Product("Chevrolet", 52000.0, 30);
            Product ford = new Product("Ford", 48000.0, 27);
            productRepository.save(bmw);
            productRepository.save(honda);
            productRepository.save(kia);
            productRepository.save(chevrolet);
            productRepository.save(ford);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
