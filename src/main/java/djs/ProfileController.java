package djs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProfileController {
	@GetMapping(value="/profile")
	public Map<String, String> getProfile() {
		Map<String, String> profile = new HashMap<String, String>();
		profile.put("gender",  "male");
		return profile;
	}
}
