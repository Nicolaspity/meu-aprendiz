package com.infoa.meu_aprendiz.controllers;




@RestController
public class CursoController {
    
    @Autowired
        private CursoService cursoService;

    @GetMapping("/count")
    public Long contador(){
        return CursoService.contador();
    };

   @PostMapping("/salvar/{curso}")
        public Curso Salvar(@RequestBody Curso curso) {
            return CursoService.salvar(curso);
        };
}
