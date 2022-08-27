package LeetCode;

//Medium

//Given a string array words, return the maximum value of length(word[i]) * length(word[j])
//where the two words do not share common letters. If no such two words exist, return 0.

//Учитывая строковый массив слов, вернуть максимальное значение длины (слово [i]) * длину (слово [j]),
//где два слова не имеют общих букв. Если таких двух слов не существует, вернуть 0.

//Example 1:
//Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
//Output: 16
//Explanation: The two words can be "abcw", "xtfn".

//Example 2:
//Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
//Output: 4
//Explanation: The two words can be "ab", "cd".

//Example 3:
//Input: words = ["a","aa","aaa","aaaa"]
//Output: 0
//Explanation: No such pair of words.

public class I318MaximumProductOfWordLengths {
    public static void main(String[] args) {
        //String[] words = new String[]{"abcw","baz","foo","bar","xtfn","abcdef"};
        //String[] words = new String[]{"a","ab","abc","d","cd","bcd","abcd"};
        String[] words = new String[]{"gdocnidllpfeiidcbkmcnjpekdddmochfeejiigdheajakbgomaailgpkkbjklkjphgdiakapemgpgabghlljfmjbbpapaefkjdak", "dhcknhfdbkailejimmfgdaglhjbcifolgpfaaejkmkelanag", "agpefkipapiaenhcbglgnjhiebkgfghlfejiaooknboecjlffoofioeeghmedbegjamifldlom", "gljkghbjbhkkgileinhbbkchphhhc", "pfholmojemdpnbampchnlah", "fbnonaocgbdoagkbjlmhkbheepofcacmaflelambcgpnjfjeplgjbmncibdgenjkjgmfgog", "ekonfgmjandiokigkgmpmeaadeheel", "agpaomhhlppdonpcjfipmlekpjnhnjokblknjklkfacagjjejpkbkefdfclgfnkpjocmaj", "fhlopfbmfkpkcafliplkpbfjhgfndcnfeokmodpiobm", "elboldogngpdmlildkjnmomojdibpdncopjaacjjocjoncginloknajbnnlmocfckhphldfkmphanloo", "hjdifjnakflcpcbeekhcoebohgbdhodjn", "kilhmlkmmmbcimagjgm", "jookcalodcfjiegldblk", "dpdppeenkalkfgklkjccifbddlmageokiepcgkgaccp", "jgbcdgoplockhfmecfb", "ceonaenpjoebnfmdnnjbamccjbhmnpaoaolcjekdohpclajojcgcmhcaiphkoleggeecheceimhaiepmiimegaajdcj", "ckklhboflogekfncahibonfomeikgjo", "eibmfkldplkkmiilidfpdnkchgeghiedkbfenjdmdnnoihobdaomgaengfepbedmmconjcaeghnokcdcabib", "icgjcdjpjmgidmahcfffjjijicpbmkebohiajbfjhcbaeodgemoocnmhenellllfonfplkoocak", "pmpejblbjkehmgibhmnfocoljlhbihnekcgpgejmnhofbpldgibioakniiiceep", "mmkjnmfllaeooehlhhlejedbbpjipapmbfpibgcdmcji", "lepedhdcdmlhpnpialcffaplidpflbkdbnpam", "mfihoplepleilkcgfjmcjgmbodkhgfkpkdcjlkhoieghehcpmakpdfgkffmmohohpmebjpenmifnphnlpifaolonlc", "dbgmecldegbhnjdbmbb", "dpcdfblbddiiemijiddbfoibbojmmkcnppcbjcoafifk", "fhndcbpbnnlinjlcipnnjikocdikjbijpinkphhmhpianbcacdnelkllkoinghbdbhkjogiegkpihpbllpplamend", "nphbhjkeaablhgifopmnfikbekehfjoobmkaphoodkiigoocfkbaokihjamlbbbpme", "fafhamofldpbnbpfdjacjgnacind", "jpckingakeofoijbjnjlpoaomlhlblncaiciibelmcfhaagomhklggmpfidlfbconencpgj", "pmgiejneeijklljmhfanfnndhabkajkecmcldegkjnabnldodfhhplicmkgibaajladebdnbbbmmjlnlnmpaicglhpgpefp", "jiacoojabpgieligpedpfmjhmfffeii", "fcfjleennidcngccdphpdekfebhimdfekkljfdcodcffpjdogkahcjjjkacbimmockoeobabcikgpfdifnpogcfeamcnpljb", "adeboflmaghdadkhpngpppndmlinikdfheccgdephjjkcojjmipfkhnkjdohnfbmglp", "modfcdkmgmnkmdcpaoakngbonekchpclndhmepijnhgmmgimignac", "egjflmpchnmfhghfldcnpandaefohnmjlnkpdobgegjinlmbohfolnjikohadamimmmfidfheedf", "ldfpomgdngjodbjcaaebgjfmdepb", "mnhapgbnkglehifjjilkodmdmcipggncapbmnkcakghdnmbfldlpeeaeogniajbjdpllaaceiknchbkh", "pmklpkanghcnmipnfepneel", "lbdmebcjikjldkpnnhebfbkcndooellfgpbcdokmgbfedhfggmnhgcdjgmemdpnncedpbkhpaaaaelffgpijdhlhfpiochhggoo", "cimcacjahbmpkilfmkjpchpglanphmajmnmjfdnnnemjcbkphjbkmmdbppkljnplballcfcngaannhpioiilldboccjji", "eddaplpoceegnemdieneoonkomcfaiejegi", "beeoehjdbeokhmcekihnfpjnkenfmhiegfojjcigimpdojengjadmoafkeaghalkalomgp", "lbdlphklknldkaifoenibeemibpcpclgmimopmglbehoohnibefe", "hdfilacmbeahciihmman", "mnfllcmlolejakappanejdinaplieikmppimdfgnbnokdidjmmpknlhdgbdgjjpajemilbfj", "jfmianobkafocalipfkdimjoimofblnkl", "ecpnoojjgdnkhclocamkeeigdgcpodfjnkkdgfbagjpaojfnglonpdbodibfljgpamhbofnlidfpfnnlfiidncoleknna", "cgpidgckgamhpfhjpgaabniaieipmpigcbdljgafeiebnpho", "ojhholkmaahdfdhaoeoneakpgngilfnicokjjlpcghgdooghihajgno", "mpefgibniimmdpgggimonjmgkhpjgfogbkgpjcgbpinnddpgmhpaf", "mhogclefdolmnjehjgidkgkceaofdknlhbjlpdddjcigcbceipjmljdomfghoeebbfodgkdjoghgaopileiijcpblbdjeoaac", "ibggmgnojjhgkicknffmhhgnhgmndok", "fhpbbkmalfphknckpjpcafopdfhnbjbohcjaifkobahadeoghpenkfaidegpeonaohkofj", "hakkhfadibecojfdpcccidcgikfbjconjdgficmphkbe", "lhbjoipblfkececccmhifdjabipejoopodnonbgeclfedgmgbkejeigfmadd", "icinnjdgfgnhmhfkmpkmilcconldhjkeapglkocplmfjkiaohlebkhloapcodenclomlmlmlgifpcjhedilhohjkpc", "mgbmamifhoikehbojnbgcil", "ldhkfkajcgocdng", "hplolahnkapcohmpbofnpendpndcpeojngeacbmcfmdifdbimkgdoflefeclnjnimdlakcggnkiggiolkllnbl", "jlkmhbefoifclponofimafofe", "pimpjhclflobnpcfajccajbni", "ilpgeefhpldoobmlhmfpocibcmim", "gkkfeocokdpoognndfhnhpndcnpj", "micgojmfpfnehmlhjaigcegpkbpgikknhdgelfpkpejcdbdfifgdlepimngnoikojijenlm", "emcofaadploidipcmalnccnmiegimdigckcimbkonlfanbdljmhgilipmeaeghkbojbiidepcndcammbfkddbiblnjphbk", "ljjjeajlonanhgdcfggombfiidpldphlmfhmaalajmdbjine", "ojbmmdmoodgedidkbkckjphfcpfkokmflaieiblefjmiafji", "djijlldpnnmoppdphcgigoeo", "hnjnncfincndoilobppgdbdhnlffhmmbojehocidnffhkhkgmfggaeokeppilk", "acehokfnppnooldfogkhbndojfpjchophbodoplebbbhneejanagplhbndfmpeoajipiifeoenhgldl", "hj", "jfhnfafeopnocgibhohjopmakhaogfhmjcjbhenahpehoddncghdobbcmefnfmjbbidhekklhkpekoch", "kboaglapkjmgnjdgafhcbominbajoebgpkfkokbmpdeianecgndhpmcenmhggcegoldmdbcoofhefdaoblidl", "nngejbdkjbflghmljpomcbbappefdnlggjjcbhkjchcbhlbkanjinoopilhlcgpmkjpomfocbpkiloogfbcllnjija", "nnjnafpdigglkkbcppphechlmgcjleecajpnoaloldjbjkffdibdldndhjdmmhidhopmkopeejpbmdaggakbkmlencoacodckonp", "cfpaglkenod", "hfebklanpfepbpe", "lbmekkahbceggkbmhgeahngkeepjjfnppddageacjkkklnagjmfpbfnkdgiebmalenmopbpjggjkpoaoiflnloeln", "ncfgkmmchblfhobhhelpbiogoeamegljmmcpkgnhbkfaiehcofnafbaej", "ppmjieodijaaiikmljckmeknagjociabjkfml", "ccjoifcnnbeohbjgphomlmpomeignionjlelkccfbhbdpcnmfobihlcomii", "lmbjdhkgnboienkgappncgbojinldkiklmaaaffenbbpcdodncombb", "madhnihaicigckoldmpmniogjglpakdkpconhomnmlknjnhjcbmcbppglmlppekbamnjbefbkhdaj", "epjlohphpecmhhpadfoignomjloaafiamncedlhihodlhdcjpcegedpiebmfbcnofacmhml", "lbmhnjjpjgjmaoipffcpimdhelejgfdaaeimajkfjoembjdkikpl", "aaikdamdmhkmpcodhbamk", "foonflpjdpokgomjdbfegbpchfpkmfg", "phkhklhieckkfgodbfaolcppibfmefdhjoficommjcmbccdbidopdjgcodbeemepdakcpbojelhinpobcdciom", "plmbogahgldkfffhebbkkelfdoaceloenepimdpadnimfjfemheghnohjonnfbkmngikckbmloejohbbgkpfijjjaldnjah", "ogaojibgpjnhhknodibejndfphnmiolikplakjlomjnmnfpigncgccnlcpfjinjidomgcpcfcoceljlmjfmhjkpahhcpiefd", "gbiglaopbekamlenjdaplmglagjifinndhklimoloknnjpfpbfglgkfkenkfmbkhgnljfngnmhmhkhcbkamplpmjdb", "jaiehenfjnhkbeogefelobcoeklhjffkdeghofekccfpcjgaachkc", "oamoffahljpciegohabccooigoojlhdohgdofkldfohoahejgddcfigahe", "ebhnhbcdjleaeljpgamnemcljinhhedhlmngeahbpdogkmihdafmdnjnacih", "lhkhmkccpggjcbnlgmdinglidbgpfchpfopjabliblceahgkijolmjaldfohnahhllhmnfmlgmobpnmen", "gjichlepdcdlaocknmdlgnhnbnmfne", "mkjmgibigiobobhcjhcaa", "albkcnhbabpecomddgbddkmeinicngjcfoncijpfebmcfjbkemkelelakbnblhpdgjmecbpfaklgnnedpndfcooimj", "mbannmpjjbmoefoeojhnhlfbddmhhpgeenmml", "iaiigjjaammfbgjdgjejlnhemlceddgclohmnpjceljlpi", "bjhhdhndffbaonemgdddnlpmfofld", "pokdifalolpeikpdjdnodfjdjfejdlgmllhohaklhnffcijpdenhodddjaealphdpmgbfbbjjnlljbmjleoiclkpefhdjfnnp"};

        //long m = System.currentTimeMillis();
        System.out.println(maxProduct(words));
        //System.out.println((double) (System.currentTimeMillis() - m));

    }

    public static int maxProduct(String[] words) {
        int state[] = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int val = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                int index = ch - 'a';
                val = (val | (1 << index));
            }
            state[i] = val;
        }
        int result = 0;
        for (int i = 0; i < words.length - 1; i++)
            for (int j = i + 1; j < words.length; j++) {
                if ((state[i] & state[j]) == 0) {
                    result = Math.max(result, (words[i].length() * words[j].length()));
                }
            }
        return result;
    }
}
//Runtime: 13 ms, faster than 93.72% of Java online submissions for Maximum Product of Word Lengths.


// Мой вариант (time exceed)
//    public static int maxProduct(String[] words) {
//        int result = 0;
//        int result2 = 0;
//
//        for (int i = words.length-1; i > 0; i--) {
//            String[] wordSplit = words[i].split("");
//
//            for (int j = words.length-1; j > 0; j--) {
//                if (result2 > result) {
//                    result = result2;
//                }
//                for (int k = 0; k < wordSplit.length; k++) {
//                    if (!words[j-1].contains(wordSplit[k])) {
//                        result2 = words[i].length()*words[j-1].length();
//                    }
//                    if (words[j-1].contains(wordSplit[k])) {
//                        result2 = 0;
//                        break;
//                    }
//                }
//            }
//            if (result2 > result) {
//                result = result2;
//            }
//        }
//        return result;
//    }
//}

//boolean	contentEquals(CharSequence cs)   < вместо contains
//Сравнивает эту строку с указанным CharSequence.


