package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface sl6 {
    List getDependentWorkIds(String str);

    boolean hasCompletedAllPrerequisites(String str);

    boolean hasDependents(String str);

    void insertDependency(ol6 ol6Var);
}
