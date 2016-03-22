package zipcode.tandagotchi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lucky on 3/14/16.
 */
@RestController
public class TandaController {


    @RequestMapping(value="/tanda" , method= RequestMethod.GET)
    public String Hello(){
        return "hellow";
    }

}
