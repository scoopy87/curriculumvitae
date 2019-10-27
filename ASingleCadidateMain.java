package curriculumvitae;

import java.util.ArrayList;

public class ASingleCadidateMain {

    private static JavaJunior cV;

    private ASingleCadidateMain(){
       
        if (cV != null){
            throw new RuntimeException("There is a single candidate! Use getInstance() to know him!");
        }
    } 

    public static JavaJunior getInstance(){
        if (cV == null){ 
        	Nume alexManole = new Nume("Manole", "Alexandru");
        	
        	Job devmindTrainee = new Job(new Date(0, "March", 2019) , new Date(0, "October", 2019), 
        			"Devmind", "JAVA Junior Trainee",
        			"\n\tCovered topics:\n" + 
        			"\t- Basics of programming: data types, operators, statements, methods\n" + 
        			"\t- Java API: understand the advantages and benefits of API\n" + 
        			"\t- Collections. Data structures\n" + 
        			"\t- Object Oriented Programming: inheritance, encapsulation, abstraction, polymorphism\n" + 
        			"\t- Algorithms\n" + 
        			"\t- I/O stream\n" + 
        			"\t- Treating exceptions\n" +
        			"\t- Concurrency\n" + 
        			"\n\tAcquired skills:\n" + 
        			"\t- Algorithmic skills\n" + 
        			"\t- OOP skills\n" + 
        			"\t- Debugging\n" + 
        			"\t- Testing\n" + 
        			"\t- Architecture design\n" + 
        			"\n\tAssessments:\n" + 
        			"\t- Practical and theoretical exams - Homework and daily Quizzes\n" + 
        			"\t- Projects and applications\n" + 
        			"\t- Coding challenges\n" + 
        			"\t- Algorithmic training\n");
        	
        	Job website = new Job(new Date(0, "September", 2019), new Date(0), 
        			"www.iCell.ro Online Store & www.Scan-Hire.com People Recruitment Services Website", "Web designer & Co-Owner",
        			"\n\t- Built desktop and mobile website\n" + 
        			"\t- Edited photos and design elements using Adobe Photoshop and Illustrator\n" +
        			"\t- Tested website across browsers, operating systems and devices\n" + 
        			"\t- Optimized loading speeds and capacity\n" + 
        			"\t- Debugged pages and fixed broken links or images\n" + 
        			"\t- Updated website content based on SEO principles\n" + 
        			"\t- Created and optimized products Facebook campaigns & ads\n" +
        			"\t- Monitored and analysed site performance\n");
        	
        	Job serviceTelefoaneMobile = new Job(new Date(0, "March", 2014), new Date(0), 
        			"Service Telefoane Mobile", "Owner", 
        			"\n\t- Mobile hardware and software troubleshooting and repairs" +
        			"\n\t- Software security & OS debugging" +
        			"\n\t- Firmware customizations" +
        			"\n\t- Customers and suppliers management \n");
            
        	Studies master = new Studies(new Date(0, "October", 2009),new Date(0, "July", 2011),
        			"Universitatea Romano-Americana","Master - Managementul Strategic al Firmei");
        	
        	Studies licenta = new Studies(new Date(0, "October", 2006),new Date(0, "July", 2009),
        			"Universitatea Romano-Americana","Licenta - Management");
        	
        	ArrayList<Parcurs> xp = new ArrayList<>();
        	
        	xp.add(devmindTrainee);
        	xp.add(website);
        	xp.add(serviceTelefoaneMobile);
        	xp.add(master);
        	xp.add(licenta);
        	
        	Experience<Parcurs> experienta = new Experience<Parcurs>(xp);
        	
        	cV = new JavaJunior(alexManole , new Date(4, "June", 1987), experienta);
        }

        return cV;
    }
 
}