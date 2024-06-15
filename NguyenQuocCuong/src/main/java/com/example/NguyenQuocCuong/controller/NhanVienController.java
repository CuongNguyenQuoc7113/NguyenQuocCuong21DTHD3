package com.example.NguyenQuocCuong.controller;

import com.example.NguyenQuocCuong.model.NhanVien;
import com.example.NguyenQuocCuong.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", nhanVienService.getAll());
        return "employee_list";
    }

    @GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new NhanVien());
        return "add-employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute NhanVien employee) {
        nhanVienService.add(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{maNV}")
    public String showEditEmployeeForm(@PathVariable String maNV, Model model) {
        model.addAttribute("employee", nhanVienService.get(maNV));
        return "edit";
    }

    @PostMapping("/edit/{maNV}")
    public String editEmployee(@PathVariable String maNV, @ModelAttribute NhanVien employee) {
        nhanVienService.update(maNV, employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{maNV}")
    public String deleteEmployee(@PathVariable String maNV) {
        nhanVienService.remove(maNV);
        return "redirect:/employees";
    }
}
