import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean stop = false;
    public static void main(String[] args) {
        ArrayList<Long> id = new ArrayList<>();

        do {
            System.out.println("Введите комманду: ");
            Scanner scanner = new Scanner(System.in);
            String Command = scanner.next();
            switch (Command) {
                case ("help"):
                    commandHelp();
                    break;
                case ("info"):
                    commandInfo();
                    break;
                case ("show"):
                    commandShow();
                    break;
                case ("add"):
                    commandAdd();
                    break;
                case ("update id"):
                    commandUpdateId();
                    break;
                case ("remove_by_id"):
                    commandRemoveById();
                    break;
                case ("clear"):
                    commandClear();
                    break;
                case ("save"):
                    commandSave();
                    break;
                case ("execute_script"):
                    commandExecuteScript();
                    break;
                case ("exit"):
                    commandExit();
                    break;
                case ("remove_first"):
                    commandRemoveFirst();
                    break;
                case ("remove_head"):
                    commandRemoveHead();
                    break;
                case ("add_if_min"):
                    commandAddIfMin();
                    break;
                case ("print_descending"):
                    commandPrintDescending();
                    break;
                case ("print_unique_standard_of_living"):
                    commandPrintUniqueStandardOfLiving();
                    break;
                case ("print_field_ascending_standard_of_living"):
                    commandPrintFieldAscendingStandardOfLiving();
                    break;
                default:
                    System.out.println("Такой комманды не существует! Для просмотра списка комманд введите 'help'");
            }
        } while (!stop);
    }

    private static void commandPrintFieldAscendingStandardOfLiving() {

    }

    private static void commandPrintUniqueStandardOfLiving() {

    }

    private static void commandPrintDescending() {

    }

    private static void commandAddIfMin() {

    }

    private static void commandRemoveHead() {

    }

    private static void commandRemoveFirst() {

    }

    private static void commandExecuteScript() {

    }

    private static void commandSave() {

    }

    private static void commandClear() {

    }

    private static void commandRemoveById() {

    }

    private static void commandUpdateId() {

    }

    private static void commandAdd() {

    }

    private static void commandShow() {

    }

    private static void commandInfo() {

    }

    private static void commandExit() {
        stop = true;
        System.out.println("Завершение работы");
    }

    public static void commandHelp(){
        System.out.println("help : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "add {element} : добавить новый элемент в коллекцию\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_by_id id : удалить элемент из коллекции по его id\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "remove_first : удалить первый элемент из коллекции\n" +
                "remove_head : вывести первый элемент коллекции и удалить его\n" +
                "add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции\n" +
                "print_descending : вывести элементы коллекции в порядке убывания\n" +
                "print_unique_standard_of_living : вывести уникальные значения поля standardOfLiving всех элементов в коллекции\n" +
                "print_field_ascending_standard_of_living : вывести значения поля standardOfLiving всех элементов в порядке возрастания");
    }
}
