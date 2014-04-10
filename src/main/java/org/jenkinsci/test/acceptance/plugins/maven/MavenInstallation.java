/*
 * The MIT License
 *
 * Copyright (c) 2014 Red Hat, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.test.acceptance.plugins.maven;

import org.jenkinsci.test.acceptance.po.Describable;
import org.jenkinsci.test.acceptance.po.JenkinsConfig;
import org.jenkinsci.test.acceptance.po.ToolInstallation;

import java.util.regex.Pattern;

@Describable("Maven")
public class MavenInstallation extends ToolInstallation {

    public MavenInstallation(JenkinsConfig context, String path) {
        super(context, path);
    }

    @Override
    public Pattern updatesPattern() {
        return Pattern.compile("Obtained the updated data file for hudson.tasks.Maven.MavenInstaller");
    }

    public void useNative() {
        installedIn(fakeHome("mvn", "M2_HOME"));
    }
}