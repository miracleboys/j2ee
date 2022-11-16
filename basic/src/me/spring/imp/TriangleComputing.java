package me.spring.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import me.spring.service.ComputingService;

@Service
public class TriangleComputing implements ComputingService{
	 /**
     * @param params 三个边的边长
     */
    @Override
    public double area(List<Double> params) {
        // 三角形的面积S=√p(p-a)(p-b)(p-c)
        // 其中：p=(a+b+c)/2, a,b,c是三角形的三条边
        // 如： a = 1.414 b = 1.0 c = 1.0
        double p = 0;
        for (double value : params) {
            p += value;
        }
        p = p / 2;
        double result = p;
        for (double value : params) {
            result *= p - value;
        }
        return Math.sqrt(result);
    }
}
