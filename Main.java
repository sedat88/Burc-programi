import java.util.Scanner;
    // Burç bulan program
public class Main {
        public static void main(String[] orgs) {
            int month, day;
            String burc = "";
            boolean isError = false;
            Scanner scan = new Scanner(System.in);

            System.out.print("Doğduğunuz Ay : ");
            month = scan.nextInt();

            System.out.print("Doğduğunuz Gün : ");
            day = scan.nextInt();

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak Burcu";
                    } else {
                        burc = "Kova Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova Burcu";
                    } else {
                        burc = "Balık Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık Burcu";
                    } else {
                        burc = "Koç Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç Burcu";
                    } else {
                        burc = "Boğa Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa Burcu";
                    } else {
                        burc = "İkizler Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler Burcu";
                    } else {
                        burc = "Yengeç Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç Burcu";
                    } else {
                        burc = "Aslan Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 8) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Aslan Burcu";
                    } else {
                        burc = "Başak Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 9) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Başak Burcu";
                    } else {
                        burc = "Terazi Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 10) {
                if (day >= 1 && day <= 28) {
                    if (day < 23) {
                        burc = "Terazi Burcu";
                    } else {
                        burc = "Akrep Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 11) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Akrep Burcu";
                    } else {
                        burc = "Yay Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay Burcu";
                    } else {
                        burc = "Oğlak Burcu";
                    }
                } else {
                    isError = true;
                }
            }

            if (isError) {
                System.out.println("Hatalı bir giriş yaptınız! Tekrar deneyin.");
            } else {
                System.out.println("Burcunuz : " + burc);

            }
        }
    }









































