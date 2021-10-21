package com.revature.main;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        /*
        app.post("/example", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                String name = ctx.body();
                ctx.result(name);
            }
        });
        */


    }
}
