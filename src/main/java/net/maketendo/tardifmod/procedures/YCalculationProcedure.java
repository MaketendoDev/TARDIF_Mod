package net.maketendo.tardifmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class YCalculationProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(Level.OVERWORLD);
			if (world != null) {
				if (!((world.getBlockState(BlockPos.containing(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 5, new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
						if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
							_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 5)));
					} else {
						if ((world.getBlockState(BlockPos.containing(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 10, new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
							if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
								_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 10)));
						} else {
							if ((world.getBlockState(BlockPos.containing(new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 15, new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
								if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
									_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 15)));
							} else {
								if ((world.getBlockState(BlockPos.containing(new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 20, new Object() {
									double convert(String s) {
										try {
											return Double.parseDouble(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
									if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
										_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 20)));
								} else {
									if ((world.getBlockState(BlockPos.containing(new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 25, new Object() {
										double convert(String s) {
											try {
												return Double.parseDouble(s.trim());
											} catch (Exception e) {
											}
											return 0;
										}
									}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
										if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
											_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 25)));
									} else {
										if ((world.getBlockState(BlockPos.containing(new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 30, new Object() {
											double convert(String s) {
												try {
													return Double.parseDouble(s.trim());
												} catch (Exception e) {
												}
												return 0;
											}
										}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
											if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
												_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
													double convert(String s) {
														try {
															return Double.parseDouble(s.trim());
														} catch (Exception e) {
														}
														return 0;
													}
												}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 30)));
										} else {
											if ((world.getBlockState(BlockPos.containing(new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 35, new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
												if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
													_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
														double convert(String s) {
															try {
																return Double.parseDouble(s.trim());
															} catch (Exception e) {
															}
															return 0;
														}
													}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 35)));
											} else {
												if ((world.getBlockState(BlockPos.containing(new Object() {
													double convert(String s) {
														try {
															return Double.parseDouble(s.trim());
														} catch (Exception e) {
														}
														return 0;
													}
												}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
													double convert(String s) {
														try {
															return Double.parseDouble(s.trim());
														} catch (Exception e) {
														}
														return 0;
													}
												}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 40, new Object() {
													double convert(String s) {
														try {
															return Double.parseDouble(s.trim());
														} catch (Exception e) {
														}
														return 0;
													}
												}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
													if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
														_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
															double convert(String s) {
																try {
																	return Double.parseDouble(s.trim());
																} catch (Exception e) {
																}
																return 0;
															}
														}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 40)));
												} else {
													if ((world.getBlockState(BlockPos.containing(new Object() {
														double convert(String s) {
															try {
																return Double.parseDouble(s.trim());
															} catch (Exception e) {
															}
															return 0;
														}
													}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
														double convert(String s) {
															try {
																return Double.parseDouble(s.trim());
															} catch (Exception e) {
															}
															return 0;
														}
													}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 45, new Object() {
														double convert(String s) {
															try {
																return Double.parseDouble(s.trim());
															} catch (Exception e) {
															}
															return 0;
														}
													}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
														if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
															_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																double convert(String s) {
																	try {
																		return Double.parseDouble(s.trim());
																	} catch (Exception e) {
																	}
																	return 0;
																}
															}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 45)));
													} else {
														if ((world.getBlockState(BlockPos.containing(new Object() {
															double convert(String s) {
																try {
																	return Double.parseDouble(s.trim());
																} catch (Exception e) {
																}
																return 0;
															}
														}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
															double convert(String s) {
																try {
																	return Double.parseDouble(s.trim());
																} catch (Exception e) {
																}
																return 0;
															}
														}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 50, new Object() {
															double convert(String s) {
																try {
																	return Double.parseDouble(s.trim());
																} catch (Exception e) {
																}
																return 0;
															}
														}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
															if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																	double convert(String s) {
																		try {
																			return Double.parseDouble(s.trim());
																		} catch (Exception e) {
																		}
																		return 0;
																	}
																}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 50)));
														} else {
															if ((world.getBlockState(BlockPos.containing(new Object() {
																double convert(String s) {
																	try {
																		return Double.parseDouble(s.trim());
																	} catch (Exception e) {
																	}
																	return 0;
																}
															}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																double convert(String s) {
																	try {
																		return Double.parseDouble(s.trim());
																	} catch (Exception e) {
																	}
																	return 0;
																}
															}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 55, new Object() {
																double convert(String s) {
																	try {
																		return Double.parseDouble(s.trim());
																	} catch (Exception e) {
																	}
																	return 0;
																}
															}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																	_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																		double convert(String s) {
																			try {
																				return Double.parseDouble(s.trim());
																			} catch (Exception e) {
																			}
																			return 0;
																		}
																	}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 55)));
															} else {
																if ((world.getBlockState(BlockPos.containing(new Object() {
																	double convert(String s) {
																		try {
																			return Double.parseDouble(s.trim());
																		} catch (Exception e) {
																		}
																		return 0;
																	}
																}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																	double convert(String s) {
																		try {
																			return Double.parseDouble(s.trim());
																		} catch (Exception e) {
																		}
																		return 0;
																	}
																}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 60, new Object() {
																	double convert(String s) {
																		try {
																			return Double.parseDouble(s.trim());
																		} catch (Exception e) {
																		}
																		return 0;
																	}
																}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																	if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																		_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																			double convert(String s) {
																				try {
																					return Double.parseDouble(s.trim());
																				} catch (Exception e) {
																				}
																				return 0;
																			}
																		}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 60)));
																} else {
																	if ((world.getBlockState(BlockPos.containing(new Object() {
																		double convert(String s) {
																			try {
																				return Double.parseDouble(s.trim());
																			} catch (Exception e) {
																			}
																			return 0;
																		}
																	}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																		double convert(String s) {
																			try {
																				return Double.parseDouble(s.trim());
																			} catch (Exception e) {
																			}
																			return 0;
																		}
																	}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 65, new Object() {
																		double convert(String s) {
																			try {
																				return Double.parseDouble(s.trim());
																			} catch (Exception e) {
																			}
																			return 0;
																		}
																	}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																		if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																			_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																				double convert(String s) {
																					try {
																						return Double.parseDouble(s.trim());
																					} catch (Exception e) {
																					}
																					return 0;
																				}
																			}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 65)));
																	} else {
																		if ((world.getBlockState(BlockPos.containing(new Object() {
																			double convert(String s) {
																				try {
																					return Double.parseDouble(s.trim());
																				} catch (Exception e) {
																				}
																				return 0;
																			}
																		}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																			double convert(String s) {
																				try {
																					return Double.parseDouble(s.trim());
																				} catch (Exception e) {
																				}
																				return 0;
																			}
																		}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 70, new Object() {
																			double convert(String s) {
																				try {
																					return Double.parseDouble(s.trim());
																				} catch (Exception e) {
																				}
																				return 0;
																			}
																		}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																			if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																				_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																					double convert(String s) {
																						try {
																							return Double.parseDouble(s.trim());
																						} catch (Exception e) {
																						}
																						return 0;
																					}
																				}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 70)));
																		} else {
																			if ((world.getBlockState(BlockPos.containing(new Object() {
																				double convert(String s) {
																					try {
																						return Double.parseDouble(s.trim());
																					} catch (Exception e) {
																					}
																					return 0;
																				}
																			}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																				double convert(String s) {
																					try {
																						return Double.parseDouble(s.trim());
																					} catch (Exception e) {
																					}
																					return 0;
																				}
																			}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 75, new Object() {
																				double convert(String s) {
																					try {
																						return Double.parseDouble(s.trim());
																					} catch (Exception e) {
																					}
																					return 0;
																				}
																			}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																				if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																					_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																						double convert(String s) {
																							try {
																								return Double.parseDouble(s.trim());
																							} catch (Exception e) {
																							}
																							return 0;
																						}
																					}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 75)));
																			} else {
																				if ((world.getBlockState(BlockPos.containing(new Object() {
																					double convert(String s) {
																						try {
																							return Double.parseDouble(s.trim());
																						} catch (Exception e) {
																						}
																						return 0;
																					}
																				}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																					double convert(String s) {
																						try {
																							return Double.parseDouble(s.trim());
																						} catch (Exception e) {
																						}
																						return 0;
																					}
																				}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 80, new Object() {
																					double convert(String s) {
																						try {
																							return Double.parseDouble(s.trim());
																						} catch (Exception e) {
																						}
																						return 0;
																					}
																				}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																					if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																						_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																							double convert(String s) {
																								try {
																									return Double.parseDouble(s.trim());
																								} catch (Exception e) {
																								}
																								return 0;
																							}
																						}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 80)));
																				} else {
																					if ((world.getBlockState(BlockPos.containing(new Object() {
																						double convert(String s) {
																							try {
																								return Double.parseDouble(s.trim());
																							} catch (Exception e) {
																							}
																							return 0;
																						}
																					}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																						double convert(String s) {
																							try {
																								return Double.parseDouble(s.trim());
																							} catch (Exception e) {
																							}
																							return 0;
																						}
																					}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 85, new Object() {
																						double convert(String s) {
																							try {
																								return Double.parseDouble(s.trim());
																							} catch (Exception e) {
																							}
																							return 0;
																						}
																					}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																						if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																							_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																								double convert(String s) {
																									try {
																										return Double.parseDouble(s.trim());
																									} catch (Exception e) {
																									}
																									return 0;
																								}
																							}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 85)));
																					} else {
																						if ((world.getBlockState(BlockPos.containing(new Object() {
																							double convert(String s) {
																								try {
																									return Double.parseDouble(s.trim());
																								} catch (Exception e) {
																								}
																								return 0;
																							}
																						}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																							double convert(String s) {
																								try {
																									return Double.parseDouble(s.trim());
																								} catch (Exception e) {
																								}
																								return 0;
																							}
																						}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 90, new Object() {
																							double convert(String s) {
																								try {
																									return Double.parseDouble(s.trim());
																								} catch (Exception e) {
																								}
																								return 0;
																							}
																						}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																							if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																								_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																									double convert(String s) {
																										try {
																											return Double.parseDouble(s.trim());
																										} catch (Exception e) {
																										}
																										return 0;
																									}
																								}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 90)));
																						} else {
																							if ((world.getBlockState(BlockPos.containing(new Object() {
																								double convert(String s) {
																									try {
																										return Double.parseDouble(s.trim());
																									} catch (Exception e) {
																									}
																									return 0;
																								}
																							}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																								double convert(String s) {
																									try {
																										return Double.parseDouble(s.trim());
																									} catch (Exception e) {
																									}
																									return 0;
																								}
																							}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 95, new Object() {
																								double convert(String s) {
																									try {
																										return Double.parseDouble(s.trim());
																									} catch (Exception e) {
																									}
																									return 0;
																								}
																							}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																								if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																									_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																										double convert(String s) {
																											try {
																												return Double.parseDouble(s.trim());
																											} catch (Exception e) {
																											}
																											return 0;
																										}
																									}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 95)));
																							} else {
																								if ((world.getBlockState(BlockPos.containing(new Object() {
																									double convert(String s) {
																										try {
																											return Double.parseDouble(s.trim());
																										} catch (Exception e) {
																										}
																										return 0;
																									}
																								}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : ""), new Object() {
																									double convert(String s) {
																										try {
																											return Double.parseDouble(s.trim());
																										} catch (Exception e) {
																										}
																										return 0;
																									}
																								}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 100, new Object() {
																									double convert(String s) {
																										try {
																											return Double.parseDouble(s.trim());
																										} catch (Exception e) {
																										}
																										return 0;
																									}
																								}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "")))).getBlock() == Blocks.AIR) {
																									if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
																										_tf.setValue((new java.text.DecimalFormat("##.##").format(new Object() {
																											double convert(String s) {
																												try {
																													return Double.parseDouble(s.trim());
																												} catch (Exception e) {
																												}
																												return 0;
																											}
																										}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "") + 100)));
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			world = _worldorig;
		}
	}
}
