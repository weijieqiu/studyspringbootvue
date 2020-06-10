package com.itgreatq.studyspringboot.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/table")
public class TableMockController {

    @GetMapping("/list")
    public String list(){
        String result = "{\n" +
                "  \"code\": 20000,\n" +
                "  \"data\": {\n" +
                "    \"total\": 20,\n" +
                "    \"items\": [\n" +
                "      {\n" +
                "        \"id\": \"50000019881228 0656\",\n" +
                "        \"title\": \"Otnoait idy hhgolmn ruvldo fgvb dpgj qjux sshcm lawtekf mirqukqg krxsd qgdomjvgoq wmfum iksjvej nmhw ciyuik qrubcgth ewcj recxb wtqvmiymdc.\",\n" +
                "        \"status\": \"deleted\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2014-12-03 17:12:40\",\n" +
                "        \"pageviews\": 2460\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"210000198504052468\",\n" +
                "        \"title\": \"Olknexv seve kjlf jshyklvxq ngptnilv p xjscucn zzohc cbqgkxs jxghs tsimbtjtr pspngwj ynncmdvg.\",\n" +
                "        \"status\": \"deleted\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2017-08-08 00:54:09\",\n" +
                "        \"pageviews\": 2351\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"610000 201605227916\",\n" +
                "        \"title\": \"Pbx yujv gsoxhj ivuino kpve uys junhamh ysdhqsvij kvft ei zvhckq fuwhrruxh josrm dgwbiwdba ovinepdi yawgbxukhg brshgbke.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2003-01-15 05:39:55\",\n" +
                "        \"pageviews\": 4308\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"1 10000200001173651\",\n" +
                "        \"title\": \"Jxxg zsoifmo xyjrw fqdldn netksezicx cknfdguve rgbag osw hvnluwy yhdngtk wrvlfv mrpj ilkucrj aglocxgfh zsl ortr pmtkoflv oeunetv dkgk  goreks kredhwgv.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1986-02-01 23:50:46\",\n" +
                "        \"pageviews\": 4045\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"13000019881015530X\",\n" +
                "        \"title\": \"Faqud psopbbeu rw byxpous yqsyyj hlngteu tdxiedcpi iafbelfe otkcrd mnccjrwpf cft rbdiig nvyvhpom k dmraui bmqepvdu srohrfcds lsqstmcb hgrsxee lgybtu uor.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1984-07-05 18:02:14\",\n" +
                "        \"pageviews\": 4633\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"120000201 704033547\",\n" +
                "        \"title\": \"Jboogtger yvpphcd gpd kvib nhpalfb pwyxdehc vscweuxs kwqabbe c imlm nqwqwq psedi udww ftqv elmpkwl xcfqaevx tkdkgwldx fmfqn tvvg oni.\",\n" +
                "        \"status\": \"published\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1975-03-19 07:03:03\",\n" +
                "        \"pageviews\": 582\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"120000197210165786\",\n" +
                "        \"title\": \"Rdcuof xspiueavy mbmn plxbqfp vkkqo gdt u lrjtul befbg ywwbuady lacr xrx gchxl yxwowexwd jrkwyqz oyyqdykriv impfqv fdgyx q eityppsg mcwggvwu lfezzqtw.\",\n" +
                "        \"status\": \"published\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1995-01-27 22:11:18\",\n" +
                "        \"pageviews\": 3994\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"42000019711120068X\",\n" +
                "        \"title\": \"D hmoyf wcdckn buuzeqwp kiyrq ykda inszso oip bligid olqejqw jsiu eoxthjz uryzror. \",\n" +
                "        \"status\": \"deleted\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1975-08-19 18:42:43\",\n" +
                "        \"pageviews\": 1648\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"330000198002260723\",\n" +
                "        \"title\": \"Fdxekvdpgd qlyrffp sqqxefuqnj qp dsxq wsftswrna tdaqesaloj ggmyjrjeid iqnujq kcfdkuv eupks qnfhkmm srgdlifvm pgcg ri kgqu.\",\n" +
                "        \"status\": \"deleted\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1989-06-29 21:07:51\",\n" +
                "        \"pageviews\": 4445\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"710000200906123132\",\n" +
                "        \"title\": \"Alnp cbgzw jstojhxr fnka zbv dchd wcsh skulb tqnuotyw jhbbnl fiodnkfp jixizn xengyb jzrbydnj thfmoi uhty zlgkvqyjps xznxzgcwka.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2006-01-22 00:25:49\",\n" +
                "        \"pageviews\": 1721\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"37000020031118686X\",\n" +
                "        \"title\": \"Svu nneiyqh hqodwi vlldzs emnybqofe ecwplxwz xmbiv tkrvfsn pkboiatv ccgoc govoyubxlb lcwprhm uj ytbbr.\",\n" +
                "        \"status\": \"published\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2012-04-01 17:21:26\",\n" +
                "        \"pageviews\": 3966\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"150000201506060865\",\n" +
                "        \"title\": \"Hovun cvnan uljq qoep dshv cisvx iob rdypgzw pwso bfrr vysu qjgqitxfpk.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"na me\",\n" +
                "        \"display_time\": \"1985-05-15 11:46:55\",\n" +
                "        \"pageviews\": 3419\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"13000019840917 6817\",\n" +
                "        \"title\": \"Ztp knpeobole wbhwrdimf bcdsghhj cxjqdv gtlyhitjp pdqt uhe lgevd mfac wievireiqb uwsaxrsqk bedcwmki sdvo jag cemfxd.\",\n" +
                "        \"status\": \"deleted\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1985-10-07 04:30:06\",\n" +
                "        \"pageviews\": 1365\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"3400001999 05215567\",\n" +
                "        \"title\": \"Zyjmhmv bytxgn vikr kuobxbu mbmtlqw xsrnwm lyfw ntulfwsk ddfe iy zxszcir uvdtp nxnrll wrkmwllxk mqp wblmyqea feubmuhjj yowt rvlbkv hgdgegerq.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1989-09-19 21:49:23\",\n" +
                "        \"pageviews\": 3105\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"650000199005277343\",\n" +
                "        \"title\": \"Apzs rlpvsm vvxhmwae dlwrueup mymbd zpo lufoxuqg xjsptrkr wtrx jfyxv vlwp infnoiu sfkvd jcwse vylidxrjs ohtqs mocifs wkh wgpxxnppbr vpekmzklm idxdldjgox.\",\n" +
                "        \"status\": \"published\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1989-07-12 19:17:41\",\n" +
                "        \"pageviews\": 2855\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"330000198511140770\",\n" +
                "        \"ti tle\": \"Toypymbtg stgsoeed fsnqojr ctuqegnt dfjylfvfn ldt pmdsvtmkcd qbhpiwmmc iow y nqqm xfjosre tbgxym cwgoifmex gjaxticyf vkxsdmvg zpxebo aepwh wxreolmn oknnpyg t xneg.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2013-10-31 06:45:52\",\n" +
                "        \"pageviews\": 1189\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"410000199809230044\",\n" +
                "        \"title\": \"Madd lplxgyz zjeoqnjvf qsgd bns rlmig uturt blofhqn kzhbyaqig twpyujkkb gfrf odjdw xrtqo fhnwgf uxxv vuzx vg hpha oodyxw ijujl.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1983-04-05 13:25:43\",\n" +
                "        \"pageviews\": 1092\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"330000201706295830\",\n" +
                "        \"title\": \"Vgsut mydhqch vw zophi vnshzq ghhkxnnhq kgkwsggr igxbu zrgx inmb myyyi ftiwndseg svj qaguxmfr.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2015-02-10 13:46:33\",\n" +
                "        \"pageviews\": 467\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"530000201410093487\",\n" +
                "        \"title\": \"Ecuzvkp mpppypu iojijpdxzj obbjuvt gbl sd tsweotsjs lwnqeg uqnq lthsuyncom kzbi gvo.\",\n" +
                "        \"status\": \"draft\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"1995-07-19 04:34:37\",\n" +
                "        \"pageviews\": 515\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": \"340000197502284008\",\n" +
                "        \"title\": \"Ikgltfibhw nhvc yxkcbegrly yyjshkqx tdfyy nlmh vjifh vyram lnifqb xrdp y rjkn mrgnecrd xhrt jeflker.\",\n" +
                "        \"status\": \"published\",\n" +
                "        \"author\": \"name\",\n" +
                "        \"display_time\": \"2012-10-08 23:40:02\",\n" +
                "        \"pageviews\": 739\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        return result;
    }
}
