/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     dakshinamurthy.karra@gmail.com - bug 165371
 *******************************************************************************/
package sc.ndt.ui.externaltools.internal.model;

/**
 * Defines the constants available for client use.
 * <p>
 * This interface is not intended to be extended or implemented by clients.
 * </p>
 */
public interface IExternalToolConstants {
	/**
	 * Plugin identifier for external tools (value <code>org.eclipse.ui.externaltools</code>).
	 */
	public static final String PLUGIN_ID = "org.eclipse.ui.externaltools"; //$NON-NLS-1$;

	// ------- Extensions Points -------
	/**
	 * Extension point to declare the launch configuration type that should be
	 * created when duplicating an existing configuration as a project builder.
	 */
	public static final String EXTENSION_POINT_CONFIGURATION_DUPLICATION_MAPS = "configurationDuplicationMaps"; //$NON-NLS-1$
	// ------- Refresh Variables -------
	/**
	 * Variable that expands to the workspace root object (value <code>workspace</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#VAR_WORKSPACE}
	 */
	public static final String VAR_WORKSPACE = sc.ndt.core.externaltools.internal.IExternalToolConstants.VAR_WORKSPACE;
	/**
	 * Variable that expands to the project resource (value <code>project</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#VAR_PROJECT}
	 */
	public static final String VAR_PROJECT = sc.ndt.core.externaltools.internal.IExternalToolConstants.VAR_PROJECT;
	/**
	 * Variable that expands to the container resource (value <code>container</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#VAR_CONTAINER}
	 */
	public static final String VAR_CONTAINER = sc.ndt.core.externaltools.internal.IExternalToolConstants.VAR_CONTAINER;
	/**
	 * Variable that expands to a resource (value <code>resource</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#VAR_RESOURCE}
	 */
	public static final String VAR_RESOURCE = sc.ndt.core.externaltools.internal.IExternalToolConstants.VAR_RESOURCE;
	/**
	 * Variable that expands to the working set object (value <code>working_set</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#VAR_WORKING_SET}
	 */
	public static final String VAR_WORKING_SET = sc.ndt.core.externaltools.internal.IExternalToolConstants.VAR_WORKING_SET;
	// ------- Tool Types -------
	/**
	 * External tool type for programs such as executables, batch files, 
	 * shell scripts, etc (value <code>programType</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#TOOL_TYPE_PROGRAM}
	 */
	public static final String TOOL_TYPE_PROGRAM = sc.ndt.core.externaltools.internal.IExternalToolConstants.TOOL_TYPE_PROGRAM;

	// ------- Build Types -------
	/**
	 * Build type indicating an incremental project build request for
	 * the external tool running as a builder (value <code>incremental</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#BUILD_TYPE_INCREMENTAL}
	 */
	public static final String BUILD_TYPE_INCREMENTAL = sc.ndt.core.externaltools.internal.IExternalToolConstants.BUILD_TYPE_INCREMENTAL;

	/**
	 * Build type indicating a full project build request for
	 * the external tool running as a builder (value <code>full</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#BUILD_TYPE_FULL}
	 */
	public static final String BUILD_TYPE_FULL = sc.ndt.core.externaltools.internal.IExternalToolConstants.BUILD_TYPE_FULL;

	/**
	 * Build type indicating an automatic project build request for
	 * the external tool running as a builder (value <code>auto</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#BUILD_TYPE_AUTO}
	 */
	public static final String BUILD_TYPE_AUTO = sc.ndt.core.externaltools.internal.IExternalToolConstants.BUILD_TYPE_AUTO;
	
	/**
	 * Build type indicating a clean project build request for
	 * the external tool running as a builder (value <code>clean</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#BUILD_TYPE_CLEAN}
	 */
	public static final String BUILD_TYPE_CLEAN = sc.ndt.core.externaltools.internal.IExternalToolConstants.BUILD_TYPE_CLEAN;

	/**
	 * Build type indicating no project build request for
	 * the external tool running as a builder (value <code>none</code>).
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#BUILD_TYPE_NONE}
	 */
	public static final String BUILD_TYPE_NONE = sc.ndt.core.externaltools.internal.IExternalToolConstants.BUILD_TYPE_NONE;

	// ------- Images -------

	/**
	 * Main tab image.
	 */
	public static final String IMG_TAB_MAIN = PLUGIN_ID + ".IMG_TAB_MAIN"; //$NON-NLS-1$

	/**
	 * Build tab image
	 */
	public static final String IMG_TAB_BUILD = PLUGIN_ID + ".IMG_TAB_BUILD"; //$NON-NLS-1$

	// ------- Launch configuration types --------
	/**
	 * Program launch configuration type identifier.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE}
	 */
	public static final String ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE = sc.ndt.core.externaltools.internal.IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE;
	
	/**
	 * Program builder launch configuration type identifier. Program project
	 * builders are of this type.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ID_PROGRAM_BUILDER_LAUNCH_CONFIGURATION_TYPE}
	 */
	public static final String ID_PROGRAM_BUILDER_LAUNCH_CONFIGURATION_TYPE = sc.ndt.core.externaltools.internal.IExternalToolConstants.ID_PROGRAM_BUILDER_LAUNCH_CONFIGURATION_TYPE;
	
	// ------- Launch configuration category --------
	/**
	 * Identifier for external tools launch configuration category. Launch
	 * configuration types for external tools that appear in the external tools
	 * launch configuration dialog should belong to this category.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ID_EXTERNAL_TOOLS_LAUNCH_CATEGORY}
	 */
	public static final String ID_EXTERNAL_TOOLS_LAUNCH_CATEGORY = sc.ndt.core.externaltools.internal.IExternalToolConstants.ID_EXTERNAL_TOOLS_LAUNCH_CATEGORY;
	/**
	 * Identifier for external tools launch configuration builders category.
	 * Launch configuration types that can be added as project builders should
	 * belong to this category.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ID_EXTERNAL_TOOLS_BUILDER_LAUNCH_CATEGORY}
	 */
	public static final String ID_EXTERNAL_TOOLS_BUILDER_LAUNCH_CATEGORY = sc.ndt.core.externaltools.internal.IExternalToolConstants.ID_EXTERNAL_TOOLS_BUILDER_LAUNCH_CATEGORY;

	// ------- Launch configuration groups --------
	/**
	 * Identifier for external tools launch configuration group. The external
	 * tools launch configuration group corresponds to the external tools
	 * category in run mode.
	 */
	public static final String ID_EXTERNAL_TOOLS_LAUNCH_GROUP = "org.eclipse.ui.externaltools.launchGroup"; //$NON-NLS-1$
	/**
	 * Identifier for external tools launch configuration group
	 */
	public static final String ID_EXTERNAL_TOOLS_BUILDER_LAUNCH_GROUP = "org.eclipse.ui.externaltools.launchGroup.builder"; //$NON-NLS-1$

	// ------- Common External Tool Launch Configuration Attributes -------

	/**
	 * Boolean attribute indicating if external tool output should be captured.
	 * Default value is <code>false</code>.
	 * @deprecated since 3.1 Replaced by <code>org.eclipse.debug.core.DebugPlugin.ATTR_CAPTURE_OUTPUT</code>
	 */
	public static final String ATTR_CAPTURE_OUTPUT = PLUGIN_ID + ".ATTR_CAPTURE_OUTPUT"; //$NON-NLS-1$
	/**
	 * String attribute identifying the location of an external. Default value
	 * is <code>null</code>. Encoding is tool specific.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_LOCATION}
	 */
	public static final String ATTR_LOCATION = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_LOCATION;

	/**
	 * Boolean attribute indicating if the user should be prompted for
	 * arguments before running a tool. Default value is <code>false</code>.
	 * THIS ATTRIBUTE IS NOT USED.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_PROMPT_FOR_ARGUMENTS}
	 */
	public static final String ATTR_PROMPT_FOR_ARGUMENTS = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_PROMPT_FOR_ARGUMENTS;
	
	/**
	 * String attribute identifying the scope of resources that should trigger an 
	 * external tool to run. Default value is <code>null</code>
	 * indicating that the builder will be triggered for all changes.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_BUILDER_SCOPE}
	 */
	public static final String ATTR_BUILDER_SCOPE = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_BUILDER_SCOPE;
		
	/**
	 * String attribute containing an array of build kinds for which an
	 * external tool builder should be run.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_RUN_BUILD_KINDS}
	 */
	public static final String ATTR_RUN_BUILD_KINDS = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_RUN_BUILD_KINDS;
	
	/**
	 * Boolean attribute indicating if the console should be shown on external
	 * tool output. Default value is <code>false</code>.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_SHOW_CONSOLE}
	 */
	public static final String ATTR_SHOW_CONSOLE = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_SHOW_CONSOLE;

	/**
	 * String attribute containing the arguments that should be passed to the
	 * tool. Default value is <code>null</code>, and encoding is tool specific.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_TOOL_ARGUMENTS}
	 */
	public static final String ATTR_TOOL_ARGUMENTS = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_TOOL_ARGUMENTS;

	/**
	 * String attribute identifying the working directory of an external tool.
	 * Default value is <code>null</code>, which indicates a default working
	 * directory, which is tool specific.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_WORKING_DIRECTORY}
	 */
	public static final String ATTR_WORKING_DIRECTORY = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_WORKING_DIRECTORY;
	
	/**
	 * String attribute identifying whether an external tool builder configuration
	 * is enabled. The default value is <code>true</code>, which indicates
	 * that the configuration will be executed as appropriate by the builder.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_BUILDER_ENABLED}
	 */
	public static final String ATTR_BUILDER_ENABLED = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_BUILDER_ENABLED;
	
	/**
	 * Status code indicating an unexpected internal error.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ERR_INTERNAL_ERROR}
	 */
	public static final int ERR_INTERNAL_ERROR = sc.ndt.core.externaltools.internal.IExternalToolConstants.ERR_INTERNAL_ERROR;

	/**
	 * String attribute identifying a non-external tool builder launch configuration that is disabled
	 * The value is the name of the disabled builder.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_DISABLED_BUILDER}
	 */
	public static final String ATTR_DISABLED_BUILDER = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_DISABLED_BUILDER;
	
	/**
	 * boolean attribute identifying that an external tool builder has been configured for triggering
	 * using the <code>ICommand.setBuilding(int)</code> mechanism
	 * @since 3.1
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_TRIGGERS_CONFIGURED}
	 */
	public static final String ATTR_TRIGGERS_CONFIGURED = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_TRIGGERS_CONFIGURED;

	/**
	 * String attribute identifying the build scope for a launch configuration.
	 * <code>null</code> indicates the default workspace build.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_BUILD_SCOPE}
	 */
	public static final String ATTR_BUILD_SCOPE = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_BUILD_SCOPE;

	/**
	 * Attribute identifier specifying whether referenced projects should be 
	 * considered when computing the projects to build. Default value is
	 * <code>true</code>.
	 * @deprecated use {@link sc.ndt.core.externaltools.internal.IExternalToolConstants#ATTR_INCLUDE_REFERENCED_PROJECTS}
	 */
	public static final String ATTR_INCLUDE_REFERENCED_PROJECTS = sc.ndt.core.externaltools.internal.IExternalToolConstants.ATTR_INCLUDE_REFERENCED_PROJECTS;
}