package com.sunbeam.pojo;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankRates {

	private List<LoanRate> loanRates;
    private List<FdRate> fdRates;

}