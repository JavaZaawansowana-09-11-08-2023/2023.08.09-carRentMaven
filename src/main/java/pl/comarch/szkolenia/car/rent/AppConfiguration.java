package pl.comarch.szkolenia.car.rent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.comarch.szkolenia.car.rent")
public class AppConfiguration {

    /*@Bean
    public Core core(ICarRepository carRepository, GUI gui) {
        Core core = new Core();
        core.setGui(gui);
        core.setCarRepository(carRepository);

        return core;
    }
    @Bean
    public ICarRepository carRepository() {
        return new CarRepository();
    }

    @Bean
    public GUI gui(ICarRepository carRepository) {
        return new GUI(carRepository);
    }*/
}
