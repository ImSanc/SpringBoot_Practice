package com.practice.springboot.Service;

import com.practice.springboot.DTO.PaymentRequest;
import com.practice.springboot.DTO.PaymentResponse;
import com.practice.springboot.Entity.PaymentEntity;
import com.practice.springboot.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){

        PaymentEntity paymentModel = paymentRepository.getPaymentById(internalRequestObj);

        PaymentResponse paymentResponse = mapModelToResponseDto(paymentModel);
        return paymentResponse;

    }

    private PaymentResponse mapModelToResponseDto(PaymentEntity paymentEntity){

        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return response;
    }
}
