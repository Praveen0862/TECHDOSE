class Solution {

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sAm=Integer.valueOf(arriveAlice.substring(0,2));

        int sAd=Integer.valueOf(arriveAlice.substring(3,5));

        int eAm=Integer.valueOf(leaveAlice.substring(0,2));

        int eAd=Integer.valueOf(leaveAlice.substring(3,5));

       

        int sBm=Integer.valueOf(arriveBob.substring(0,2));

        int sBd=Integer.valueOf(arriveBob.substring(3,5));

        int eBm=Integer.valueOf(leaveBob.substring(0,2));

        int eBd=Integer.valueOf(leaveBob.substring(3,5));

       

        int start=0,startM=0;

        int end=0,endM=0;

        //System.out.println(sAd+" "+eAd);

        //System.out.println(sBd+" "+eBd);

        if(sAm<sBm) {

            start=sBd;

            startM=sBm;

        }

        else if(sAm>sBm) {

            start=sAd;

            startM=sAm;

        }

        else {

            if(sAd>sBd) {

                start=sAd;

                startM=sAm;

            }

            else {

                start=sBd;

                startM=sBm;

            }

        }

        if(eAm>eBm) {

            end=eBd;

            endM=eBm;

        }

        else if(eAm<eBm) {

            end=eAd;

            endM=eAm;

        }

        else {

            if(eAd<eBd) {

                end=eAd;

                endM=eAm;

            }

            else {

                end=eBd;

                endM=eBm;

            }

        }

        System.out.println(start+" "+end);

        int count=0;

        if(startM>endM) return 0;

        if(startM==endM) {

            if(start<=end) {

                count=end-start;

                return count+1;

            }

            else return 0;

        }

        for(int i=startM;i<=endM;i++) {

            if(i==startM) count+=days[i-1]-start+1;

            else if(i==endM) count+=end;

            else count+=days[i-1];

        }

        return count;

    }

}
        

