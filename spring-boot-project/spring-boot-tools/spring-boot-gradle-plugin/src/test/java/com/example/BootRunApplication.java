/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.Arrays;

/**
 * Very basic application used for testing {@code BootRun}.
 *
 * @author Andy Wilkinson
 */
public class BootRunApplication {

	protected BootRunApplication() {

	}

	public static void main(String[] args) {
		dumpClassPath();
		dumpArgs(args);
		dumpJvmArgs();
	}

	private static void dumpClassPath() {
		int i = 1;
		for (String entry : ManagementFactory.getRuntimeMXBean().getClassPath()
				.split(File.pathSeparator)) {
			System.out.println(i++ + ". " + entry);
		}
	}

	private static void dumpArgs(String[] args) {
		System.out.println(Arrays.toString(args));
	}

	private static void dumpJvmArgs() {
		System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());
	}

}
