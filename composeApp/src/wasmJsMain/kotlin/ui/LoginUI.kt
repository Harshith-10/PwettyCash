package ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pwettycash.composeapp.generated.resources.Res
import pwettycash.composeapp.generated.resources.notebook
import ui.components.PlainTextField
import ui.myiconpack.GoogleIcon
import ui.myiconpack.Password24dp
import ui.theme.Stripe

@Preview
@Composable
fun LoginUI(
    logoFontFamily: FontFamily
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Stripe),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(IntrinsicSize.Max)
                .padding(vertical = 16.dp, horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(16.dp))
                    .background(color = Color.Black.copy(alpha = 0.4f),)
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(Res.drawable.notebook),
                    contentDescription = "Logo",
                    modifier = Modifier.size(70.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "Petty Cashbook",
                        style = MaterialTheme.typography.h5.copy(
                            fontFamily = logoFontFamily,
                            fontWeight = FontWeight.Bold
                        ),
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(1.dp))

                    Text(
                        text = "Your Delightful Money Manager!",
                        style = MaterialTheme.typography.body1.copy(
                            fontStyle = FontStyle.Italic,
                            fontFamily = logoFontFamily,
                            fontWeight = FontWeight.SemiBold
                        ),
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(16.dp))
                    .background(color = Color.Black.copy(alpha = 0.4f))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.h3.copy(
                        fontFamily = logoFontFamily,
                        fontWeight = FontWeight.Bold
                    ),
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(12.dp))

                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    PlainTextField(
                        value = username,
                        onValueChange = { username = it },
                        label = {
                            Text(
                                text = "Username",
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = rememberVectorPainter(Icons.Default.Face),
                                contentDescription = "Username",
                            )
                        },
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                            .fillMaxWidth()
                            .height(56.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .padding(16.dp),
                        textStyle = TextStyle(
                            fontSize = 20.sp,
                        )
                    )

                    PlainTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = {
                            Text(
                                text = "Password",
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = rememberVectorPainter(Password24dp),
                                contentDescription = "Password",
                            )
                        },
                        trailingIcon = {

                        },
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                            .fillMaxWidth()
                            .height(56.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .padding(16.dp),
                        textStyle = TextStyle(
                            fontSize = 20.sp,
                        )
                    )

                    var visible by remember { mutableStateOf(false) }

                    AnimatedVisibility(visible = visible) {
                        Row(
                            modifier = Modifier.fillMaxWidth(0.7f),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = rememberVectorPainter(Icons.Default.Warning),
                                contentDescription = "Warning",
                                modifier = Modifier.size(12.dp),
                                tint = Color.White
                            )

                            Spacer(modifier = Modifier.width(4.dp))

                            Text(
                                text = "Invalid credentials",
                                //fontFamily = typoGrotesk,
                                fontSize = 14.sp,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = { /* TODO */ visible = !visible },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Black,
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                            .fillMaxWidth()
                            .height(56.dp)
                            .clip(CircleShape)

                    ) {
                        Text(
                            text = "Login",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row (
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Divider(
                            color = Color.White,
                            modifier = Modifier
                                .weight(1f)
                                .height(1.dp)
                        )
                        Text(
                            text = "OR",
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )
                        Divider(
                            color = Color.White,
                            modifier = Modifier
                                .weight(1f)
                                .height(1.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = { /* TODO */ },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 4.dp)
                            .fillMaxWidth()
                            .height(56.dp)
                            .clip(CircleShape)

                    ) {
                        Image(
                            painter = rememberVectorPainter(GoogleIcon),
                            contentDescription = "Google",
                            modifier = Modifier.size(24.dp)
                        )

                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Sign in with Google",
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}