package mygame.rpg.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiConstants.PREFIX + "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class Test {

	@GetMapping
	public ResponseEntity<?> test() {
		return ResponseEntity.ok().body("test is OK");
	}

}
