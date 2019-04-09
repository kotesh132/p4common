package com.p4.pp.runner;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public interface ICommandLineParser {

	void processArgs() throws FileNotFoundException;

}
