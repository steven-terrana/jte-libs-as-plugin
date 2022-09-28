.. _home: 

This repository has been deprecated. 

Instead, you should checkout the `JTE Library Scaffold <https://github.com/steven-terrana/jte-library-scaffold>`_ which uses the `Gradle JTE Plugin <https://github.com/jenkinsci/gradle-jte-plugin>`_ to package a library source as a Jenkins plugin.

-------------------------
Sample Library Repository
-------------------------

There is a ``Makefile`` at the root of this repository that can help with the various 
tasks you might need to perform.  These tasks are outlined below along with how to 
customize various aspects of this repository to fit your needs. 

.. important:: Docker is a prerequisite to take advantage of the ``make`` commands. 

===================
Building the Plugin
===================

To build the Jenkins Plugin run: 

    | ``make jpi`` 

**********************
Customizing the Plugin
**********************

The plugin is configured via the ``build.gradle`` file.  This file is contains comments 
outlining how to customize the plugin.  

The plugin is built using the `Gradle JPI Plugin <https://github.com/jenkinsci/gradle-jpi-plugin>`_ 
and more configuration options can be seen there. 

================
Adding Libraries
================

Libraries are just directories under ``src/main/resources/libraries``.  To create a new library, just 
create a new directory.  It will be referenceable for loading via the directory name. 

It is recommended that you have a ``README.rst`` for each library, outlining the steps provided and 
configuration options for the library.  This README will automatically be compiled into the documentation. 

==========================
Building the Documentation
==========================

The documentation is built using `Sphinx <http://www.sphinx-doc.org/en/master/>`_ and the 
`Read the Docs <https://sphinx-rtd-theme.readthedocs.io/en/stable/>`_ theme. 

The documentation is configured via the ``conf.py`` file at the root of this repository. 

Building the documentation requires docker and can be done via: 

    | ``make docs`` 

This will compile the documentation and can be viewed at ``docs/_build/html/README.html``. 

*************
Hot Reloading
*************

To get view the documentation updated in realtime during local development, run: 

    | ``make docs live``

The documentation will be viewable at ``http://localhost:8000`` 

.. toctree::
   :maxdepth: 1
   :glob:
   :caption: Libraries 📖

   src/main/resources/**/README
