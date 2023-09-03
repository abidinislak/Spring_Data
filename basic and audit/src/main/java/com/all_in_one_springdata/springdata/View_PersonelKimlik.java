package com.jjuga.jjuga.model;


import org.hibernate.annotations.Subselect;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Immutable
@Subselect("SELECT        TCKMLNMR, PBIK, SOYADI, ADI, RTBKOD, BLNKITKOD, BLNGRVKOD, CNS, TLFIS, CEPTLF, SNFRTBACK\n" +
		"FROM            AS400.dbo.PRSKMLTML")

public class View_PersonelKimlik {

	@Id
	private long tckmlnmr;
	private long pbik;
	private String soyadi;
	private String adi;
	private long blnkitkod;
	private Character cns;
	private long tlfis;
	private long ceptlf;
	private String snfrtback;

	public View_PersonelKimlik() {
	}


	public long getTckmlnmr() {
		return tckmlnmr;
	}

	public void setTckmlnmr(long tckmlnmr) {
		this.tckmlnmr = tckmlnmr;
	}

	public long getPbik() {
		return pbik;
	}

	public void setPbik(long pbik) {
		this.pbik = pbik;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public long getBlnkitkod() {
		return blnkitkod;
	}

	public void setBlnkitkod(long blnkitkod) {
		this.blnkitkod = blnkitkod;
	}

	public Character getCns() {
		return cns;
	}

	public void setCns(Character cns) {
		this.cns = cns;
	}

	public long getTlfis() {
		return tlfis;
	}

	public void setTlfis(long tlfis) {
		this.tlfis = tlfis;
	}

	public long getCeptlf() {
		return ceptlf;
	}

	public void setCeptlf(long ceptlf) {
		this.ceptlf = ceptlf;
	}

	public String getSnfrtback() {
		return snfrtback;
	}

	public void setSnfrtback(String snfrtback) {
		this.snfrtback = snfrtback;
	}
}
