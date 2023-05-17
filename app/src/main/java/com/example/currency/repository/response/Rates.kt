package com.example.currency.repository.response

import com.google.gson.annotations.SerializedName

data class Rates(
    @SerializedName("AED") private val aed: Double,
    @SerializedName("AFN") private val afn: Double,
    @SerializedName("ALL") private val all: Double,
    @SerializedName("AMD") private val amd: Double,
    @SerializedName("ANG") private val ang: Double,
    @SerializedName("AOA") private val aoa: Double,
    @SerializedName("ARS") private val ars: Double,
    @SerializedName("AUD") private val aud: Double,
    @SerializedName("AWG") private val awg: Double,
    @SerializedName("AZN") private val azn: Double,
    @SerializedName("BAM") private val bam: Double,
    @SerializedName("BBD") private val bbd: Double,
    @SerializedName("BDT") private val bdt: Double,
    @SerializedName("BGN") private val bgn: Double,
    @SerializedName("BHD") private val bhd: Double,
    @SerializedName("BIF") private val bif: Double,
    @SerializedName("BMD") private val bmd: Double,
    @SerializedName("BND") private val bnd: Double,
    @SerializedName("BOB") private val bob: Double,
    @SerializedName("BRL") private val brl: Double,
    @SerializedName("BSD") private val bsd: Double,
    @SerializedName("BTC") private val btc: Double,
    @SerializedName("BTN") private val btn: Double,
    @SerializedName("BWP") private val bwp: Double,
    @SerializedName("BYN") private val byn: Double,
    @SerializedName("BZD") private val bzd: Double,
    @SerializedName("CAD") private val cad: Double,
    @SerializedName("CDF") private val cdf: Double,
    @SerializedName("CHF") private val chf: Double,
    @SerializedName("CLF") private val clf: Double,
    @SerializedName("CLP") private val clp: Double,
    @SerializedName("CNH") private val cnh: Double,
    @SerializedName("CNY") private val cny: Double,
    @SerializedName("COP") private val cop: Double,
    @SerializedName("CRC") private val crc: Double,
    @SerializedName("CUC") private val cuc: Double,
    @SerializedName("CUP") private val cup: Double,
    @SerializedName("CVE") private val cve: Double,
    @SerializedName("CZK") private val czk: Double,
    @SerializedName("DJF") private val djf: Double,
    @SerializedName("DKK") private val dkk: Double,
    @SerializedName("DOP") private val dop: Double,
    @SerializedName("DZD") private val dzd: Double,
    @SerializedName("EGP") private val egp: Double,
    @SerializedName("ERN") private val ern: Double,
    @SerializedName("ETB") private val etb: Double,
    @SerializedName("EUR") private val eur: Double,
    @SerializedName("FJD") private val fjd: Double,
    @SerializedName("FKP") private val fkp: Double,
    @SerializedName("GBP") private val gbp: Double,
    @SerializedName("GEL") private val gel: Double,
    @SerializedName("GGP") private val ggp: Double,
    @SerializedName("GHS") private val ghs: Double,
    @SerializedName("GIP") private val gip: Double,
    @SerializedName("GMD") private val gmd: Double,
    @SerializedName("GNF") private val gnf: Double,
    @SerializedName("GTQ") private val gtq: Double,
    @SerializedName("GYD") private val gyd: Double,
    @SerializedName("HKD") private val hkd: Double,
    @SerializedName("HNL") private val hnl: Double,
    @SerializedName("HRK") private val hrk: Double,
    @SerializedName("HTG") private val htg: Double,
    @SerializedName("HUF") private val huf: Double,
    @SerializedName("IDR") private val idr: Double,
    @SerializedName("ILS") private val ils: Double,
    @SerializedName("IMP") private val imp: Double,
    @SerializedName("INR") private val inr: Double,
    @SerializedName("IQD") private val iqd: Double,
    @SerializedName("IRR") private val irr: Double,
    @SerializedName("ISK") private val isk: Double,
    @SerializedName("JEP") private val jep: Double,
    @SerializedName("JMD") private val jmd: Double,
    @SerializedName("JOD") private val jod: Double,
    @SerializedName("JPY") private val jpy: Double,
    @SerializedName("KES") private val kes: Double,
    @SerializedName("KGS") private val kgs: Double,
    @SerializedName("KHR") private val khr: Double,
    @SerializedName("KMF") private val kmf: Double,
    @SerializedName("KPW") private val kpw: Double,
    @SerializedName("KRW") private val krw: Double,
    @SerializedName("KWD") private val kwd: Double,
    @SerializedName("KYD") private val kyd: Double,
    @SerializedName("KZT") private val kzt: Double,
    @SerializedName("LAK") private val lak: Double,
    @SerializedName("LBP") private val lbp: Double,
    @SerializedName("LKR") private val lkr: Double,
    @SerializedName("LRD") private val lrd: Double,
    @SerializedName("LSL") private val lsl: Double,
    @SerializedName("LYD") private val lyd: Double,
    @SerializedName("MAD") private val mad: Double,
    @SerializedName("MDL") private val mdl: Double,
    @SerializedName("MGA") private val mga: Double,
    @SerializedName("MKD") private val mkd: Double,
    @SerializedName("MMK") private val mmk: Double,
    @SerializedName("MNT") private val mnt: Double,
    @SerializedName("MOP") private val mop: Double,
    @SerializedName("MRU") private val mru: Double,
    @SerializedName("MUR") private val mur: Double,
    @SerializedName("MVR") private val mvr: Double,
    @SerializedName("MWK") private val mwk: Double,
    @SerializedName("MXN") private val mxn: Double,
    @SerializedName("MYR") private val myr: Double,
    @SerializedName("MZN") private val mzn: Double,
    @SerializedName("NAD") private val nad: Double,
    @SerializedName("NGN") private val ngn: Double,
    @SerializedName("NIO") private val nio: Double,
    @SerializedName("NOK") private val nok: Double,
    @SerializedName("NPR") private val npr: Double,
    @SerializedName("NZD") private val nzd: Double,
    @SerializedName("OMR") private val omr: Double,
    @SerializedName("PAB") private val pab: Double,
    @SerializedName("PEN") private val pen: Double,
    @SerializedName("PGK") private val pgk: Double,
    @SerializedName("PHP") private val php: Double,
    @SerializedName("PKR") private val pkr: Double,
    @SerializedName("PLN") private val pln: Double,
    @SerializedName("PYG") private val pyg: Double,
    @SerializedName("QAR") private val qar: Double,
    @SerializedName("RON") private val ron: Double,
    @SerializedName("RSD") private val rsd: Double,
    @SerializedName("RUB") private val rub: Double,
    @SerializedName("RWF") private val rwf: Double,
    @SerializedName("SAR") private val sar: Double,
    @SerializedName("SBD") private val sbd: Double,
    @SerializedName("SCR") private val scr: Double,
    @SerializedName("SDG") private val sdg: Double,
    @SerializedName("SEK") private val sek: Double,
    @SerializedName("SGD") private val sgd: Double,
    @SerializedName("SHP") private val shp: Double,
    @SerializedName("SLL") private val sll: Double,
    @SerializedName("SOS") private val sos: Double,
    @SerializedName("SRD") private val srd: Double,
    @SerializedName("SSP") private val ssp: Double,
    @SerializedName("STD") private val std: Double,
    @SerializedName("STN") private val stn: Double,
    @SerializedName("SVC") private val svc: Double,
    @SerializedName("SYP") private val syp: Double,
    @SerializedName("SZL") private val szl: Double,
    @SerializedName("THB") private val thb: Double,
    @SerializedName("TJS") private val tjs: Double,
    @SerializedName("TMT") private val tmt: Double,
    @SerializedName("TND") private val tnd: Double,
    @SerializedName("TOP") private val top: Double,
    @SerializedName("TRY") private val _try: Double,
    @SerializedName("TTD") private val ttd: Double,
    @SerializedName("TWD") private val twd: Double,
    @SerializedName("TZS") private val tzs: Double,
    @SerializedName("UAH") private val uah: Double,
    @SerializedName("UGX") private val ugx: Double,
    @SerializedName("USD") private val usd: Int,
    @SerializedName("UYU") private val uyu: Double,
    @SerializedName("UZS") private val uzs: Double,
    @SerializedName("VES") private val ves: Double,
    @SerializedName("VND") private val vnd: Double,
    @SerializedName("VUV") private val vuv: Double,
    @SerializedName("WST") private val wst: Double,
    @SerializedName("XAF") private val xaf: Double,
    @SerializedName("XAG") private val xag: Double,
    @SerializedName("XAU") private val xau: Double,
    @SerializedName("XCD") private val xcd: Double,
    @SerializedName("XDR") private val xdr: Double,
    @SerializedName("XOF") private val xof: Double,
    @SerializedName("XPD") private val xpd: Double,
    @SerializedName("XPF") private val xpf: Double,
    @SerializedName("XPT") private val xpt: Double,
    @SerializedName("YER") private val yer: Double,
    @SerializedName("ZAR") private val zar: Double,
    @SerializedName("ZMW") private val zmw: Double,
    @SerializedName("ZWL") private val zwl: Double
)
