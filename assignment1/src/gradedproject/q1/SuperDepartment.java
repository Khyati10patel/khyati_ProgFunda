package gradedproject.q1;

//SuperDepartment is superclass for all departments
public class SuperDepartment {
    //Method to get the department name for all departments
    public String departmentName() {
        return "Super Department";
    }

    //Method to get today's work for all departments
    public String getTodaysWork() {
        return "No Work as of now";
    }

    //Method to get the work deadline for all departments
    public String getWorkDeadline() {
        return "Nil";
    }

    //Method to check if today is a holiday for all departments
    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}

//AdminDepartment is a specific department extending SuperDepartment
class AdminDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Admin Department";
    }

    //Method to get today's work for the Admin Department
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    //Method to get the work deadline for the Admin Department
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}

//HrDepartment is a specific department extending SuperDepartment
class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Hr Department";
    }

    //Method to get today's work for the HR Department
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    //Method to get the work deadline for the HR Department
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }
}

//TechDepartment is a specific department extending SuperDepartment
class TechDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    //Method to get today's work for the Tech Department
    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    //Method to get the work deadline for the Tech Department
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "core Java";
    }
}

// AdminDriver class is used to demonstrate the HrDepartment's functionalities
class AdminDriver {
    public static void main(String[] args) {
        AdminDepartment admin = new AdminDepartment();
        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
    }
}

// HrDriver class is used to demonstrate the HrDepartment's functionalities
class HrDriver {
    public static void main(String[] args) {
        HrDepartment hr = new HrDepartment();
        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.doActivity());
        System.out.println(hr.isTodayAHoliday());
    }
}

// TechDriver class is used to demonstrate the HrDepartment's functionalities
class TechDriver {
    public static void main(String[] args) {
        TechDepartment tech = new TechDepartment();
        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
    }
}