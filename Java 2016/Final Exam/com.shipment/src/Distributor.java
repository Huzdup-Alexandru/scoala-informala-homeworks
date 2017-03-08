import java.util.Iterator;



/**
 * Created by Huzdu on 3/8/2017.
 */

    public class Distributor {

        public Distributor() {
        }

        public static void main(String[] args) {
            PackageRepository repository = new PackageRepository();

            repository.addPackage(new Package(new Location("Craiova", 133), "2017-03-07"));
            repository.addPackage(new Package(new Location("Sucevita", 190), "2017-03-07"));
            repository.addPackage(new Package(new Location("Radauti", 16), "2017-03-07"));
            repository.addPackage(new Package(new Location("Suceava", 37), "2017-03-07"));
            repository.addPackage(new Package(new Location("Iasi", 115), "2017-03-07"));
            repository.addPackage(new Package(new Location("Bucuresti", 261), "2017-03-07"));
            repository.addPackage(new Package(new Location("Slobozia",169),"2017-03-07"));
            repository.addPackage(new Package(new Location("Cetinita",59),"2017-03-07"));
            repository.addPackage(new Package(new Location("Gura-Solcii",12),"2017-03-07"));
            repository.addPackage(new Package(new Location("Salaj",111),"2017-03-07"));

            int id = 1;
            String specificDate = "2017-3-07";

            synchronized(repository.getPackages()) {
                for(Iterator var5 = repository.getPackages().iterator(); var5.hasNext(); ++id) {
                    Package pack = (Package)var5.next();
                    PackageDeliveryThread deliveryThread = new PackageDeliveryThread(pack, id, specificDate);
                    deliveryThread.start();
                }

            }
        }
    }

