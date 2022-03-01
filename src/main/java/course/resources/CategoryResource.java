package course.resources;

import course.entities.Category;
import course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List <Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

//	@PostMapping
//	public Category createPerson(@RequestBody Category person) {
//		return service.save(person);
//	}

//	@PutMapping
//	public Category updatePerson(@RequestBody Category person) {
//		return service.save(person);
//	}
//
//	@DeleteMapping("/{id}")
//	public String deletePerson (@PathVariable Integer id) {
//		service.delete(id);
//		return id + " deletado ";
//	}
}
