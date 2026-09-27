package androidx.work.impl;

import defpackage.dgc;
import defpackage.sci;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
class WorkDatabase_AutoMigration_17_18_Impl extends dgc {
    public WorkDatabase_AutoMigration_17_18_Impl() {
        super(17, 18);
    }

    @Override // defpackage.dgc
    public void migrate(sci sciVar) {
        sciVar.t("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        sciVar.t("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
