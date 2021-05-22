package com.github.ledsun.intelijplugintest.services

import com.github.ledsun.intelijplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
