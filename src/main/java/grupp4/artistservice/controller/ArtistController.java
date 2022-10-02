package grupp4.artistservice.controller;


import grupp4.artistservice.model.Artist;
import grupp4.artistservice.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    public ArtistService artistService;

    @PostMapping("/")
    public Artist saveArtist(@RequestBody Artist artist){
        System.out.println("testar i controller spara album");
        return artistService.saveArtist(artist);
    }

    @GetMapping("/{artistId}")
    public Artist findById(@PathVariable("artistId") int artistId){
        System.out.println("testar att hitta artist med id i controllern");
        return artistService.findById(artistId);
    }


}
