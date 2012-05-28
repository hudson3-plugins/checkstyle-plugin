package hudson.plugins.checkstyle;

import hudson.model.AbstractProject;
import hudson.plugins.analysis.core.ResultAction;
import hudson.plugins.analysis.core.AbstractProjectAction;

/**
 * Entry point to visualize the Checkstyle trend graph in the project screen.
 * Drawing of the graph is delegated to the associated {@link ResultAction}.
 *
 * @author Ulli Hafner
 */
public class CheckStyleProjectAction extends AbstractProjectAction<ResultAction<CheckStyleResult>> {
    /**
     * Instantiates a new {@link CheckStyleProjectAction}.
     *
     * @param project
     *            the project that owns this action
     */
    public CheckStyleProjectAction(final AbstractProject<?, ?> project) {
        this(project, CheckStyleResultAction.class);
    }

    /**
     * Instantiates a new {@link CheckStyleProjectAction}.
     *
     * @param project
     *            the project that owns this action
     * @param type
     *            the result action type
     */
    public CheckStyleProjectAction(final AbstractProject<?, ?> project,
            final Class<? extends ResultAction<CheckStyleResult>> type) {
        super(project, type, Messages._Checkstyle_ProjectAction_Name(), Messages._Checkstyle_Trend_Name(),
                CheckStyleDescriptor.PLUGIN_ID, CheckStyleDescriptor.ICON_URL, CheckStyleDescriptor.RESULT_URL);
    }
}

