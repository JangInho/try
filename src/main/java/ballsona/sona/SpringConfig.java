package ballsona.sona;

import ballsona.sona.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final ListRepository listRepository;

   @Autowired
    public SpringConfig(ListRepository listRepository) {
       this.listRepository= listRepository;
   }

}
