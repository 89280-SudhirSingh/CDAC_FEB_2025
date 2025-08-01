package com.sunbeam.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.sunbeam.entity.Status;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanInfoDTO {
    
	@NotNull
    private BigDecimal amount;
	@NotNull
    private LocalDateTime approvedDate;
	@NotNull
    private int tenureMonths;
	@NotNull
    private Status status;
	@NotNull
    private Long userId;
	@NotNull
    private int totalEmis;
	@NotNull
    private BigDecimal emiAmount;
}
