import manager.InMemoryTaskManager;
import manager.Managers;
import manager.TaskManager;
import status.Status;
import tasks.Epic;
import tasks.Subtask;
import tasks.Task;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = Managers.getInMemoryTaskManager(Managers.getDefaultHistory());

        System.out.println("-> Проверка истории <-");
        System.out.println("-> Создание <-");
        taskManager.createTask(new Task("Описание-1", "Task-1", Status.NEW));
        taskManager.createTask(new Task("Описание-2", "Task-2", Status.NEW));
        taskManager.createEpic(new Epic("Описание-1", "Epic-1", Status.NEW));
        taskManager.createEpic(new Epic("Описание-2", "Epic-2", Status.NEW));
        taskManager.createSubtask(new Subtask("Описание-1", "Subtask-1", Status.NEW, 3));
        taskManager.createSubtask(new Subtask("Описание-2", "Subtask-2", Status.NEW, 3));
        taskManager.createSubtask(new Subtask("Описание-3", "Subtask-3", Status.NEW, 4));
        taskManager.createSubtask(new Subtask("Описание-4", "Subtask-4", Status.NEW, 4));

        System.out.println("-> Получение по ID <-");
        taskManager.getTaskById(1);
        taskManager.getEpicById(3);
        taskManager.getTaskById(2);
        taskManager.getSubtaskById(5);
        taskManager.getSubtaskById(6);
        taskManager.getEpicById(4);
        taskManager.getSubtaskById(5);
        taskManager.getSubtaskById(6);
        taskManager.getSubtaskById(7);
        taskManager.getSubtaskById(8);
        taskManager.getSubtaskById(7);
        taskManager.getTaskById(2);

        System.out.println("-> Получение истории <-");
        List<Task> history = taskManager.getHistory();
        System.out.println(history);

//        System.out.println("Таск");
//        System.out.println("Создание Таска");
//        taskManager.createTask(new Task("Описание-1", "Task-1", Status.NEW));
//        taskManager.createTask(new Task("Описание-2", "Task-2", Status.NEW));
//        taskManager.printTasks();
//        System.out.println("Получить все Таски");
//        List<Task> taskList = taskManager.getAllTasks();
//        System.out.println(taskList);
//        System.out.println("Получить Таск по ID");
//        Task task = taskManager.getTaskById(1);
//        System.out.println(task);
//        System.out.println("Обновление Таска");
//        task.setStatus(Status.IN_PROGRESS);
//        taskManager.updateTask(task);
//        System.out.println(task);
//        System.out.println();

//        System.out.println("Эпик");
//        System.out.println("Создание Эпика");
//        taskManager.createEpic(new Epic("Описание-1", "Epic-1", Status.NEW));
//        taskManager.createEpic(new Epic("Описание-2", "Epic-2", Status.NEW));
//        taskManager.printEpics();
//        System.out.println("Получить все Эпики");
//        List<Epic> epics = taskManager.getAllEpics();
//        System.out.println(epics);
//        System.out.println("Получить Эпик по ID");
//        Epic epic = taskManager.getEpicById(3);
//        System.out.println(epic);
//        System.out.println("Обновление Эпика");
//        epic.setStatus(Status.IN_PROGRESS);
//        taskManager.updateEpic(epic);
//        Epic epic3 = taskManager.getEpicById(3);
//        System.out.println(epic3);
//        System.out.println();

//        System.out.println("Сабтаск");
//        System.out.println("Создание Сабтаска");
//        taskManager.createSubtask(new Subtask("Описание-1", "Subtask-1", Status.NEW, 3));
//        taskManager.createSubtask(new Subtask("Описание-2", "Subtask-2", Status.NEW, 3));
//        taskManager.createSubtask(new Subtask("Описание-3", "Subtask-3", Status.NEW, 4));
//        taskManager.createSubtask(new Subtask("Описание-4", "Subtask-4", Status.NEW, 4));
//        taskManager.printSubtasks();
//        System.out.println("Получить все Таски по Эпик ID");
//        List<Subtask> subtasksByEpicId = taskManager.getAllSubtasksByEpicId(3);
//        System.out.println(subtasksByEpicId);
//        System.out.println("Получить все Сабтаски");
//        List<Subtask> subtasks = taskManager.getAllSubtasks();
//        System.out.println(subtasks);
//        System.out.println("Получение Сабтаска по ID");
//        Subtask subtask = taskManager.getSubtaskById(5);
//        System.out.println(subtask);
//        System.out.println("Обновление Сабтаска");
//        subtask.setStatus(Status.IN_PROGRESS);
//        taskManager.updateSubtask(subtask);
//        System.out.println(subtask);
//        System.out.println();

//        System.out.println("Удаление");
//        System.out.println("Удаление Таска по ID");
//        taskManager.deleteTaskById(1);
//        System.out.println(taskList);
//        System.out.println("Удаление всех Тасков");
//        taskManager.deleteAllTasks();
//        taskManager.printTasks();
//        System.out.println("Удаление Сабтасков по ID");
//        taskManager.deleteSubtaskById(5);
//        taskManager.printSubtasks();
//        System.out.println("Удаление всех Сабтасков");
//        taskManager.deleteAllSubtasks();
//        taskManager.printSubtasks();
//        System.out.println("Удаление Эпиков по ID");
//        taskManager.deleteEpicById(4);
//        taskManager.printEpics();
//        System.out.println("Удаление всех Эпиков");
//        taskManager.deleteAllEpics();
//        taskManager.printEpics();

//        System.out.println("Проверка);
//        taskManager.createTask(new Task("Описание-1", "Task-1", Status.NEW));
//        taskManager.createTask(new Task("Описание-2", "Task-2", Status.NEW));
//        taskManager.createEpic(new Epic("Описание-1", "Epic-1", Status.NEW));
//        taskManager.createEpic(new Epic("Описание-2", "Epic-2", Status.NEW));
//        taskManager.createSubtask(new Subtask("Описание-1", "Subtask-1", Status.NEW, 3));
//        taskManager.createSubtask(new Subtask("Описание-2", "Subtask-2", Status.NEW, 3));
//        taskManager.createSubtask(new Subtask("Описание-3", "Subtask-3", Status.NEW, 4));
//
//        System.out.println("Получение всех Тасков");
//        List<Task> tasks = taskManager.getAllTasks();
//        System.out.println(tasks);
//
//        System.out.println("Получение всех Эпиков");
//        List<Epic> epics = taskManager.getAllEpics();
//        System.out.println(epics);
//
//        System.out.println("Получение всех Сабтасков");
//        List<Subtask> subtasks = taskManager.getAllSubtasks();
//        System.out.println(subtasks);
//
//        System.out.println("Получение всех Сабтасков через Эпик ID");
//        List<Subtask> subtasksByEpicId = taskManager.getAllSubtasksByEpicId(3);
//        System.out.println(subtasksByEpicId);
//
//        System.out.println("Обновление");
//        Task task = taskManager.getTaskById(1);
//        task.setStatus(Status.IN_PROGRESS);
//        Subtask subtask = taskManager.getSubtaskById(5);
//        subtask.setStatus(Status.IN_PROGRESS);
//        taskManager.updateSubtask(subtask);
//        Epic epic = taskManager.getEpicById(3);
//        System.out.println(epic);
//
//        System.out.println("Удаление Таска");
//        taskManager.deleteTaskById(1);
//        taskManager.printTasks();
//        System.out.println("Удаление Эпика");
//        taskManager.deleteEpicById(3);
//        taskManager.printEpics();
    }
}
