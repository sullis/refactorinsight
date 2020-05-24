package data.types.variables;

import data.Group;
import data.RefactoringInfo;
import data.types.Handler;
import gr.uom.java.xmi.diff.ChangeReturnTypeRefactoring;
import org.refactoringminer.api.Refactoring;

public class ChangeReturnTypeHandler extends Handler {

  @Override
  public RefactoringInfo specify(Refactoring refactoring, RefactoringInfo info) {
    ChangeReturnTypeRefactoring ref = (ChangeReturnTypeRefactoring) refactoring;
    return info.setGroup(Group.VARIABLE)
        .setElementBefore(ref.getOriginalType().toString())
        .setElementAfter(ref.getChangedType().toString())
        .setNameBefore(calculateSignature(ref.getOperationBefore()))
        .setNameAfter(calculateSignature(ref.getOperationBefore()))
        .addMarking(ref.getOriginalType().codeRange(),
            ref.getChangedType().codeRange());
  }

}
