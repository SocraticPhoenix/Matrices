package io.github.socraticphoenix.matrix.workflow;

import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.impl.CopyWorkflow;
import io.github.socraticphoenix.matrix.workflow.impl.GetObjectWorkflow;
import io.github.socraticphoenix.matrix.workflow.impl.SetObjectWorkflow;
import io.github.socraticphoenix.matrix.workflow.impl.SliceWorkflow;

public interface Workflows {
    CopyWorkflow COPY = new CopyWorkflow();
    SliceWorkflow SLICE = new SliceWorkflow();
    SetObjectWorkflow SET_OBJECT = new SetObjectWorkflow();
    GetObjectWorkflow GET_OBJECT = new GetObjectWorkflow();

    Workflow<TransformWork> TRANSFER_OBJECT = GET_OBJECT.andThen(SET_OBJECT, (a, w) -> new Object[]{a[1], w});

}
