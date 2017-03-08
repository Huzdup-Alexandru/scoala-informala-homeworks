
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Huzdu on 3/7/2017.
 */
public class PackageRepository {
    private List<Package> packages = new ArrayList<>();

    private static class compareByTargetLocation implements Comparator<Package> {
        @Override
        public int compare(Package o1, Package o2) {
            if(o1.getTargetLocation().getDistance() == o2.getTargetLocation().getDistance())
                return 0;
            if(o1.getTargetLocation().getDistance() < o2.getTargetLocation().getDistance())
                return 1;
            return -1;


        }

    }
    private static class compareByDeliveryDate implements Comparator<Package> {
        @Override
        public int compare(Package o1, Package o2) {
            if(o1.getDeliveryDate().isAfter(o2.getDeliveryDate())){
                return -1;
            } else if(o1.getDeliveryDate().isBefore(o2.getDeliveryDate())){
                return 1;
            }
            return 0;
        }
    }
    public void addPackage(Package p){
        packages.add(p);
    }
    public List<Package> getPackages(){
        return packages;
    }
    public void sortPackagesByTargetLocation(){
        Collections.sort(packages, new PackageRepository.compareByTargetLocation());
    }
    public void sortPackagesByDeliveryDate(){
        Collections.sort(packages,new PackageRepository.compareByDeliveryDate());
    }

}


//     public ArrayList<Package> lista = new ArrayList<>();
//        public void sort(){
//        for(int i=1;i<=lista.size();i++){
//            int nr=0;
//            for(int j=i+1;j<=lista.size();j++) {
//                if (lista.get(i).target.equals(lista.get(j).target)) {
//                    Collections.swap(lista, i + 1, j);
//                    nr++;
//                }
//                i=i+nr-1;
//            }
//        }
//        int init=1;
//        int fin=1;
//        int merchvalue=0;
//        while(init!=lista.size()) {
//            merchvalue=0;
//            for (int i = 1; i <= lista.size(); i++) {
//                if (lista.get(init) != lista.get(i)) {
//                    fin = i;
//                    Collections.sort(lista.subList(init, fin), new Comparator<Package>() {
//                        public int compare(Package o1, Package o2) {
//
//                            return o1.deliveryDate.compareTo(o2.deliveryDate);
//                        }
//                    });
//                }
//                else
//                    merchvalue+=lista.get(i).value;
//                init = fin;
//                System.out.println(merchvalue);
//            }
//        }
//
//
//    }



