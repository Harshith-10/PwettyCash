package ui.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Password24dp: ImageVector
    get() {
        if (_password24dp != null) {
            return _password24dp!!
        }
        _password24dp = Builder(name = "Password24dp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe8eaed)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 760.0f)
                verticalLineToRelative(-80.0f)
                horizontalLineToRelative(800.0f)
                verticalLineToRelative(80.0f)
                lineTo(80.0f, 760.0f)
                close()
                moveTo(126.0f, 518.0f)
                lineTo(74.0f, 488.0f)
                lineTo(108.0f, 428.0f)
                lineTo(40.0f, 428.0f)
                verticalLineToRelative(-60.0f)
                horizontalLineToRelative(68.0f)
                lineToRelative(-34.0f, -58.0f)
                lineToRelative(52.0f, -30.0f)
                lineToRelative(34.0f, 58.0f)
                lineToRelative(34.0f, -58.0f)
                lineToRelative(52.0f, 30.0f)
                lineToRelative(-34.0f, 58.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(-68.0f)
                lineToRelative(34.0f, 60.0f)
                lineToRelative(-52.0f, 30.0f)
                lineToRelative(-34.0f, -60.0f)
                lineToRelative(-34.0f, 60.0f)
                close()
                moveTo(446.0f, 518.0f)
                lineTo(394.0f, 488.0f)
                lineTo(428.0f, 428.0f)
                horizontalLineToRelative(-68.0f)
                verticalLineToRelative(-60.0f)
                horizontalLineToRelative(68.0f)
                lineToRelative(-34.0f, -58.0f)
                lineToRelative(52.0f, -30.0f)
                lineToRelative(34.0f, 58.0f)
                lineToRelative(34.0f, -58.0f)
                lineToRelative(52.0f, 30.0f)
                lineToRelative(-34.0f, 58.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(-68.0f)
                lineToRelative(34.0f, 60.0f)
                lineToRelative(-52.0f, 30.0f)
                lineToRelative(-34.0f, -60.0f)
                lineToRelative(-34.0f, 60.0f)
                close()
                moveTo(766.0f, 518.0f)
                lineTo(714.0f, 488.0f)
                lineTo(748.0f, 428.0f)
                horizontalLineToRelative(-68.0f)
                verticalLineToRelative(-60.0f)
                horizontalLineToRelative(68.0f)
                lineToRelative(-34.0f, -58.0f)
                lineToRelative(52.0f, -30.0f)
                lineToRelative(34.0f, 58.0f)
                lineToRelative(34.0f, -58.0f)
                lineToRelative(52.0f, 30.0f)
                lineToRelative(-34.0f, 58.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(-68.0f)
                lineToRelative(34.0f, 60.0f)
                lineToRelative(-52.0f, 30.0f)
                lineToRelative(-34.0f, -60.0f)
                lineToRelative(-34.0f, 60.0f)
                close()
            }
        }
        .build()
        return _password24dp!!
    }

private var _password24dp: ImageVector? = null
