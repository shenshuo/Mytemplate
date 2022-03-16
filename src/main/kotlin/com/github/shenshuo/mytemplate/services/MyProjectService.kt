package com.github.shenshuo.mytemplate.services

import com.intellij.openapi.project.Project
import com.github.shenshuo.mytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
