package com.uahannam.order.application.service

import com.uahannam.common.annotation.UseCase
import com.uahannam.order.application.port.`in`.model.CreateOrderCommand
import com.uahannam.order.application.port.`in`.usecase.CreateOrderUseCase
import com.uahannam.order.application.port.out.CreateOrderPort
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class CreateOrderService(
    private val createOrderPort: CreateOrderPort
) : CreateOrderUseCase {
    override fun createOrder(orderCommand: CreateOrderCommand): Long? {
        TODO("Not yet implemented")
    }
}