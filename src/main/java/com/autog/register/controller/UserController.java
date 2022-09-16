package com.autog.register.controller;

import com.autog.register.dto.request.AutenticacaoRequisicao;
import com.autog.register.entity.Company;
import com.autog.register.entity.Gestor;
import com.autog.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/autenticacao")
    public ResponseEntity autenticao(@RequestBody AutenticacaoRequisicao loginUser){
        Gestor user = repository.findByLoginAndPassword(loginUser.getLogin(), loginUser.getSenha());
        Gestor gestorProvisorio = new Gestor();

        Company empresaa = new Company();
        empresaa.setIdCompany(2001);
        empresaa.setCorporateName("São Paulo Tech School");
        empresaa.setActive(true);
        empresaa.setEmail("atendimento@sptech.school");
        empresaa.setTelephone("1135894043");


        gestorProvisorio.setIdManager(501);
        gestorProvisorio.setCompany(empresaa);
        gestorProvisorio.setLogin("msantos@oncln.com");
        gestorProvisorio.setPassword("#Tortalaranja123");
        gestorProvisorio.setNameManager("Marcos Santos");
        return ResponseEntity.ok(gestorProvisorio);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        }
//        return ResponseEntity.notFound().build();
    }
}
