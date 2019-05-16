package com.na.factory;

import com.na.factory.model.Computer;
import com.na.factory.model.PC;
import com.na.factory.model.Server;


class ComputerFactory {

    static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}