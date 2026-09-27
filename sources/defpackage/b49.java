package defpackage;

import androidx.compose.ui.text.input.EditCommand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b49 implements EditCommand {
    public final /* synthetic */ EditCommand[] a;

    public b49(EditCommand[] editCommandArr) {
        this.a = editCommandArr;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(ij1 ij1Var) {
        for (EditCommand editCommand : this.a) {
            editCommand.a(ij1Var);
        }
    }
}
