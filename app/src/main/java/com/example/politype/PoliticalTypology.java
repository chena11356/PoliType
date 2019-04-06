package com.example.politype;

public class PoliticalTypology {

    //finds member's typology given scores
    public String findTypology(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, String party) {
        //note: assumes no legislators are bystanders
        //democrat typologies
        double solidLiberal = 0.01;
        double opportunityDemocrat = 0.01;
        double disaffectedDemocrat = 0.01;
        double devoutAndDiverse = 0.01;
        //republican typologies
        double newEraEnterpriser = 0.01;
        double marketSkepticRepublican = 0.01;
        double countryFirstConservative = 0.01;
        double coreConservative = 0.01;

        //a: more to help needy vs. can't afford to help needy
        if (a<0) {
            solidLiberal *= 85;
            opportunityDemocrat *= 62;
            disaffectedDemocrat *= 72;
            devoutAndDiverse *= 62;
            newEraEnterpriser *= 31;
            marketSkepticRepublican *= 32;
            countryFirstConservative *= 19;
            coreConservative *= 10;
        }
        if (a>0) {
            solidLiberal *= 12;
            opportunityDemocrat *= 33;
            disaffectedDemocrat *= 22;
            devoutAndDiverse *= 34;
            newEraEnterpriser *= 59;
            marketSkepticRepublican *= 58;
            countryFirstConservative *= 70;
            coreConservative *= 83;
        }


        //b: government wasteful vs. government good
        if (b<0) {
            solidLiberal *= 30;
            opportunityDemocrat *= 41;
            disaffectedDemocrat *= 63;
            devoutAndDiverse *= 49;
            newEraEnterpriser *= 49;
            marketSkepticRepublican *= 69;
            countryFirstConservative *= 71;
            coreConservative *= 89;
        }
        if (b>0) {
            solidLiberal *= 66;
            opportunityDemocrat *= 57;
            disaffectedDemocrat *= 32;
            devoutAndDiverse *= 47;
            newEraEnterpriser *= 47;
            marketSkepticRepublican *= 29;
            countryFirstConservative *= 21;
            coreConservative *= 8;
        }


        //c: military vs. diplomacy
        if (c<0) {
            solidLiberal *= 4;
            opportunityDemocrat *= 15;
            disaffectedDemocrat *= 14;
            devoutAndDiverse *= 32;
            newEraEnterpriser *= 41;
            marketSkepticRepublican *= 42;
            countryFirstConservative *= 54;
            coreConservative *= 71;
        }
        if (c>0) {
            solidLiberal *= 95;
            opportunityDemocrat *= 80;
            disaffectedDemocrat *= 82;
            devoutAndDiverse *= 66;
            newEraEnterpriser *= 49;
            marketSkepticRepublican *= 42;
            countryFirstConservative *= 25;
            coreConservative *= 13;
        }

		//d: discrimination strong vs. discrimination weak
		if (d<0) {
			solidLiberal *= 91;
			opportunityDemocrat *= 54;
			disaffectedDemocrat *= 63;
			devoutAndDiverse *= 41;
			newEraEnterpriser *= 17;
			marketSkepticRepublican *= 12;
			countryFirstConservative *= 9;
			coreConservative *= 5;
		}
		if (d>0) {
			solidLiberal *= 7;
			opportunityDemocrat *= 37;
			disaffectedDemocrat *= 28;
			devoutAndDiverse *= 47;
			newEraEnterpriser *= 73;
			marketSkepticRepublican *= 75;
			countryFirstConservative *= 76;
			coreConservative *= 80;
		}

        //e: regulation good vs. regulation bad
        if (e<0) {
            solidLiberal *= 96;
            opportunityDemocrat *= 76;
            disaffectedDemocrat *= 39;
            devoutAndDiverse *= 38;
            newEraEnterpriser *= 57;
            marketSkepticRepublican *= 41;
            countryFirstConservative *= 15;
            coreConservative *= 4;
        }
        if (e>0) {
            solidLiberal *= 4;
            opportunityDemocrat *= 21;
            disaffectedDemocrat *= 54;
            devoutAndDiverse *= 55;
            newEraEnterpriser *= 37;
            marketSkepticRepublican *= 53;
            countryFirstConservative *= 73;
            coreConservative *= 89;
        }


        //f: homosexuality ok vs. homosexuality bad
        if (f<0) {
            solidLiberal *= 99;
            opportunityDemocrat *= 92;
            disaffectedDemocrat *= 79;
            devoutAndDiverse *= 53;
            newEraEnterpriser *= 64;
            marketSkepticRepublican *= 62;
            countryFirstConservative *= 13;
            coreConservative *= 50;
        }
        if (f>0) {
            opportunityDemocrat *= 7;
            disaffectedDemocrat *= 15;
            devoutAndDiverse *= 37;
            newEraEnterpriser *= 28;
            marketSkepticRepublican *= 31;
            countryFirstConservative *= 70;
            coreConservative *= 37;
        }

        //g: too much profit vs. ok profit
        if (g<0) {
            solidLiberal *= 82;
            opportunityDemocrat *= 55;
            disaffectedDemocrat *= 95;
            devoutAndDiverse *= 50;
            newEraEnterpriser *= 24;
            marketSkepticRepublican *= 89;
            countryFirstConservative *= 47;
            coreConservative *= 10;
        }
        if (g>0) {
            solidLiberal *= 16;
            opportunityDemocrat *= 40;
            disaffectedDemocrat *= 4;
            devoutAndDiverse *= 43;
            newEraEnterpriser *= 68;
            marketSkepticRepublican *= 10;
            countryFirstConservative *= 42;
            coreConservative *= 82;
        }

        //h: regulation bad vs. regulation good
        if (h<0) {
            solidLiberal *= 0;
            opportunityDemocrat *= 20;
            disaffectedDemocrat *= 28;
            devoutAndDiverse *= 45;
            newEraEnterpriser *= 34;
            marketSkepticRepublican *= 39;
            countryFirstConservative *= 70;
            coreConservative *= 92;
        }
        if (h>0) {
            solidLiberal *= 100;
            opportunityDemocrat *= 79;
            disaffectedDemocrat *= 69;
            devoutAndDiverse *= 48;
            newEraEnterpriser *= 60;
            marketSkepticRepublican *= 57;
            countryFirstConservative *= 17;
            coreConservative *= 1;
        }


        //i: immigrants good vs. immigrants bad
        if (i<0) {
            solidLiberal *= 99;
            opportunityDemocrat *= 99;
            disaffectedDemocrat *= 83;
            devoutAndDiverse *= 47;
            newEraEnterpriser *= 70;
            marketSkepticRepublican *= 29;
            coreConservative *= 39;
        }
        if (i>0) {
            disaffectedDemocrat *= 11;
            devoutAndDiverse *= 44;
            newEraEnterpriser *= 23;
            marketSkepticRepublican *= 55;
            countryFirstConservative *= 76;
            coreConservative *= 43;
        }

		//j: poor easy vs. poor hard
		if (j<0) {
			opportunityDemocrat *= 28;
			disaffectedDemocrat *= 16;
			devoutAndDiverse *= 10;
			newEraEnterpriser *= 61;
			marketSkepticRepublican *= 75;
			countryFirstConservative *= 58;
			coreConservative *= 83;
		}
		if (j>0) {
			solidLiberal *= 98;
			opportunityDemocrat *= 61;
			disaffectedDemocrat *= 79;
			devoutAndDiverse *= 86;
			newEraEnterpriser *= 23;
			marketSkepticRepublican *= 14;
			countryFirstConservative *= 23;
			coreConservative *= 3;
		}

        //k: economy unfair vs. economy fair
        if (k<0) {
            solidLiberal *= 99;
            opportunityDemocrat *= 67;
            disaffectedDemocrat *= 99;
            devoutAndDiverse *= 55;
            newEraEnterpriser *= 18;
            marketSkepticRepublican *= 94;
            countryFirstConservative *= 41;
            coreConservative *= 21;
        }
        if (k>0) {
            opportunityDemocrat *= 32;
            devoutAndDiverse *= 43;
            newEraEnterpriser *= 75;
            marketSkepticRepublican *= 5;
            countryFirstConservative *= 48;
            coreConservative *= 75;
        }

		//l: equal rights already vs. not yet
		if (l<0) {
			solidLiberal *= 2;
			opportunityDemocrat *= 31;
			disaffectedDemocrat *= 7;
			devoutAndDiverse *= 8;
			newEraEnterpriser *= 48;
			marketSkepticRepublican *= 61;
			countryFirstConservative *= 66;
			coreConservative *= 81;
		}
		if (l>0) {
			solidLiberal *= 98;
			opportunityDemocrat *= 67;
			disaffectedDemocrat *= 92;
			devoutAndDiverse *= 89;
			newEraEnterpriser *= 43;
			marketSkepticRepublican *= 32;
			countryFirstConservative *= 25;
			coreConservative *= 12;
		}

		//m: foreign vs. domestic
		if (m<0) {
			solidLiberal *= 87;
			opportunityDemocrat *= 76;
			disaffectedDemocrat *= 30;
			devoutAndDiverse *= 22;
			newEraEnterpriser *= 45;
			marketSkepticRepublican *= 22;
			countryFirstConservative *= 19;
			coreConservative *= 50;
		}
		if (m>0) {
			solidLiberal *= 10;
			opportunityDemocrat *= 20;
			disaffectedDemocrat *= 63;
			devoutAndDiverse *= 69;
			newEraEnterpriser *= 48;
			marketSkepticRepublican *= 72;
			countryFirstConservative *= 66;
			coreConservative *= 44;
		}

		//n: hard work is enough vs. not enough
		if (n<0) {
			solidLiberal *= 25;
			opportunityDemocrat *= 76;
			disaffectedDemocrat *= 43;
			devoutAndDiverse *= 47;
			newEraEnterpriser *= 90;
			marketSkepticRepublican *= 65;
			countryFirstConservative *= 57;
			coreConservative *= 94;
		}
		if (n>0) {
			solidLiberal *= 73;
			opportunityDemocrat *= 22;
			disaffectedDemocrat *= 54;
			devoutAndDiverse *= 48;
			newEraEnterpriser *= 8;
			marketSkepticRepublican *= 34;
			countryFirstConservative *= 36;
			coreConservative *= 4;
		}

		//o: equal rights already vs. not yet
		if (o<0) {
			solidLiberal *= 3;
			opportunityDemocrat *= 40;
			disaffectedDemocrat *= 17;
			devoutAndDiverse *= 32;
			newEraEnterpriser *= 69;
			marketSkepticRepublican *= 57;
			countryFirstConservative *= 49;
			coreConservative *= 90;
		}
		if (o>0) {
			solidLiberal *= 97;
			opportunityDemocrat *= 57;
			disaffectedDemocrat *= 82;
			devoutAndDiverse *= 64;
			newEraEnterpriser *= 24;
			marketSkepticRepublican *= 40;
			countryFirstConservative *= 43;
			coreConservative *= 8;
		}

		//p: compromise good vs. compromise bad
		if (p<0) {
			solidLiberal *= 97;
			opportunityDemocrat *= 94;
			disaffectedDemocrat *= 61;
			devoutAndDiverse *= 26;
			newEraEnterpriser *= 56;
			marketSkepticRepublican *= 49;
			countryFirstConservative *= 9;
			coreConservative *= 30;
		}
		if (p>0) {
			solidLiberal *= 2;
			opportunityDemocrat *= 5;
			disaffectedDemocrat *= 35;
			devoutAndDiverse *= 64;
			newEraEnterpriser *= 37;
			marketSkepticRepublican *= 47;
			countryFirstConservative *= 76;
			coreConservative *= 64;
		}

        if (party.indexOf("Dem")>=0) {
            solidLiberal *= 99;
            opportunityDemocrat *= 79;
            disaffectedDemocrat *= 85;
            devoutAndDiverse *= 59;
            newEraEnterpriser *= 22;
            marketSkepticRepublican *= 12;
            countryFirstConservative *= 0;
            coreConservative *= 0;
        }
        if (party.indexOf("Rep")>=0) {
            solidLiberal *= 0;
            opportunityDemocrat *= 15;
            disaffectedDemocrat *= 2;
            devoutAndDiverse *= 27;
            newEraEnterpriser *= 66;
            marketSkepticRepublican *= 75;
            countryFirstConservative *= 95;
            coreConservative *= 97;
        }

        if (newEraEnterpriser>=marketSkepticRepublican&&newEraEnterpriser>=countryFirstConservative&&newEraEnterpriser>=coreConservative&&newEraEnterpriser>=solidLiberal&&newEraEnterpriser>=opportunityDemocrat&&newEraEnterpriser>=disaffectedDemocrat&&newEraEnterpriser>=devoutAndDiverse)
            return "New Era Enterpriser";
        if (marketSkepticRepublican>=newEraEnterpriser&&marketSkepticRepublican>=countryFirstConservative&&marketSkepticRepublican>=coreConservative&&marketSkepticRepublican>=solidLiberal&&marketSkepticRepublican>=opportunityDemocrat&&marketSkepticRepublican>=disaffectedDemocrat&&marketSkepticRepublican>=devoutAndDiverse)
            return "Market Skeptic Republican";
        if (countryFirstConservative>=newEraEnterpriser&&countryFirstConservative>=marketSkepticRepublican&&countryFirstConservative>=coreConservative&&countryFirstConservative>=solidLiberal&&countryFirstConservative>=opportunityDemocrat&&countryFirstConservative>=disaffectedDemocrat&&countryFirstConservative>=devoutAndDiverse) {
            /*
            if (coreConservative>=newEraEnterpriser&&coreConservative>=marketSkepticRepublican&&coreConservative>=devoutAndDiverse&&coreConservative>=disaffectedDemocrat&&coreConservative>=opportunityDemocrat) {
                return "Country First Conservative / Extreme";
            }
            else {
                return "Country First Conservative / Not extreme";
            }*/
            return "Country First Conservative";
        }
        if (coreConservative>=newEraEnterpriser&&coreConservative>=marketSkepticRepublican&&coreConservative>=countryFirstConservative&&coreConservative>=solidLiberal&&coreConservative>=opportunityDemocrat&&coreConservative>=disaffectedDemocrat&&coreConservative>=devoutAndDiverse)
            return "Core Conservative";
        if (solidLiberal>=opportunityDemocrat&&solidLiberal>=disaffectedDemocrat&&solidLiberal>=devoutAndDiverse&&solidLiberal>=newEraEnterpriser&&solidLiberal>=marketSkepticRepublican&&solidLiberal>=countryFirstConservative&&solidLiberal>=coreConservative)
            return "Solid Liberal";
        if (opportunityDemocrat>=solidLiberal&&opportunityDemocrat>=disaffectedDemocrat&&opportunityDemocrat>=devoutAndDiverse&&opportunityDemocrat>=newEraEnterpriser&&opportunityDemocrat>=marketSkepticRepublican&&opportunityDemocrat>=countryFirstConservative&&opportunityDemocrat>=coreConservative)
            return "Opportunity Democrat";
        if (disaffectedDemocrat>=solidLiberal&&disaffectedDemocrat>=opportunityDemocrat&&disaffectedDemocrat>=devoutAndDiverse&&disaffectedDemocrat>=newEraEnterpriser&&disaffectedDemocrat>=marketSkepticRepublican&&disaffectedDemocrat>=countryFirstConservative&&disaffectedDemocrat>=coreConservative)
            return "Disaffected Democrat";
        if (devoutAndDiverse>=solidLiberal&&devoutAndDiverse>=opportunityDemocrat&&devoutAndDiverse>=disaffectedDemocrat&&devoutAndDiverse>=newEraEnterpriser&&devoutAndDiverse>=marketSkepticRepublican&&devoutAndDiverse>=countryFirstConservative&&devoutAndDiverse>=coreConservative)
            return "Devout and Diverse";
        return "N/A";

    }
}
